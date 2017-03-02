package com.brunodles.googleimagesapi;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class QueryBuilderImpl implements QueryBuilder {

    private static final String BASE_URL = "https://www.google.com.br/search?tbm=isch";
    private StringBuilder url = new StringBuilder();

    public QueryBuilderImpl() {
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
    public String build(String query) {
        return url.append("&q=")
                .append(encode(query))
                .toString();
    }

    private String encode(String query) {
        try {
            return URLEncoder.encode(query, "UTF8");
        } catch (UnsupportedEncodingException e) {
            return URLEncoder.encode(query);
        }
    }
}
