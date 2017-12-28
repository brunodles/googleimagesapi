package com.brunodles.googleimagesapi;

public interface QueryBuilder {

    QueryBuilder size(int width, int height);

    QueryBuilder query(String query);

    QueryList<String> listImageUrls();
}
