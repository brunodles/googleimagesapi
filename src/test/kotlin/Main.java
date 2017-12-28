package com.brunodles.googleimagesapi;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {

    public static class OkHttpPageFetcher implements PageFetcher {
        @Override
        public String fetchPage(String url) {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36")
                    .build();
            try {
                Response response = client.newCall(request).execute();
                return response.body().string();
            } catch (IOException e) {
                return null;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(
                ImagesApi.queryBuilder(new OkHttpPageFetcher())
//                        .size(800, 600)
                        .query("Chuunibyou Demo Koi Ga Shitai episode 1 Um Encontro com … o olho da revelação")
                        .listImageUrls()
                        .first()
        );
    }

    private static String join(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String arg : args)
            stringBuilder.append(arg)
                    .append(" ");
        return stringBuilder.toString().trim();
    }
}
