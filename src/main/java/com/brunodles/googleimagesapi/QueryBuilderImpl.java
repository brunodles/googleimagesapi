package com.brunodles.googleimagesapi;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

class QueryBuilderImpl implements QueryBuilder {

    private static final String BASE_URL = "https://www.google.com.br/search?tbm=isch";
    private final PageFetcher pageFetcher;
    private StringBuilder url = new StringBuilder();
    private String query;

    public QueryBuilderImpl(PageFetcher pageFetcher) {
        this.pageFetcher = pageFetcher;
        url.append(BASE_URL);
    }

    @Override
    public QueryBuilder size(int width, int height) {
        url.append("&biw=")
                .append(width)
                .append("&bih=")
                .append(height);
        return this;
    }

    @Override
    public QueryBuilder query(String query) {
        this.query = query;
        return this;
    }

    private String build() {
        return url.append("&q=")
                .append(encode(query))
                .toString();
    }

    @Override
    public List<String> findUrlsOnPage() {
        return ImagesApi.findUrlsOnPage(pageFetcher.fetchPage(build()));
    }

    @Override
    public String randomImageFromPage() {
        return ImagesApi.randomImageFromPage(pageFetcher.fetchPage(build()));
    }

    private String encode(String query) {
        try {
            return URLEncoder.encode(query, "UTF8");
        } catch (UnsupportedEncodingException e) {
            return URLEncoder.encode(query);
        }
    }
}
