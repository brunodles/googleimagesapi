import com.github.brunodles.googleimagesapi.ImagesApi;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by bruno on 24/06/16.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String url = ImagesApi.builder()
                .size(800, 600)
                .build("emo girl");

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
//                .url("https://www.google.com.br/search?tbm=isch&biw=800&bih=600&q=emo%20girl")
                .url(url)
                .get()
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", "45b87222-e897-f1c0-c4d2-2890fd4c2456")
                .build();
        Response response = client.newCall(request).execute();
        String page = response.body().string();

//        System.out.println(page);
//        System.out.println("\n\n\n");


        List<String> urls = ImagesApi.findUrls(page);
        for (String s : urls) {
            System.out.println(s);
        }
        System.out.println("\n\n\n");

        System.out.println(ImagesApi.random(page));


    }

    private static String read(InputStream inputStream) throws IOException {
        StringBuilder builder = new StringBuilder();
        int c = -1;
        while ((c = inputStream.read()) != -1)
            builder.append((char) c);
        return builder.toString();
    }
}
