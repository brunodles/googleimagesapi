package com.github.brunodles.googleimagesapi;

/**
 * Created by bruno on 24/06/16.
 */
public interface QueryBuilder {

    QueryBuilder size(int width, int height);

    String build(String query);
}
