package com.brunodles.googleimagesapi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ImagesApi {

    private static final Pattern URL_PATTERN = Pattern.compile("\"ou\":\"(https?:.+?)\"");

    private ImagesApi() {
    }

    public static QueryBuilder queryBuilder(PageFetcher pageFetcher) {
        return new QueryBuilderImpl(pageFetcher);
    }

    static QueryList<String> findUrlsOnPage(String page) {
        Matcher matcher = URL_PATTERN.matcher(page);
        QueryList<String> list = new QueryList<String>();
        while (matcher.find()) list.add(matcher.group(1));
        return list;
    }
}
