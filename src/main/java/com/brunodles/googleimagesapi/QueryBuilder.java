package com.brunodles.googleimagesapi;

import java.util.List;

public interface QueryBuilder {

    QueryBuilder size(int width, int height);

    QueryBuilder query(String query);

    List<String> listImageUrls();

    String randomImage();
}
