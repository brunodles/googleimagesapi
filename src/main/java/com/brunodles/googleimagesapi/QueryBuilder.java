package com.brunodles.googleimagesapi;

public interface QueryBuilder {

    QueryBuilder size(int width, int height);

    String build(String query);
}
