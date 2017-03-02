package com.brunodles.googleimagesapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ImagesApi {

    private static final Pattern URL_PATTERN = Pattern.compile("\"ou\":\"(https?:.+?)\"");

    private ImagesApi() {
    }

    public static QueryBuilder builder() {
        return new QueryBuilderImpl();
    }

    public static List<String> findUrls(String page) {
        Matcher matcher = URL_PATTERN.matcher(page);
        ArrayList<String> list = new ArrayList<String>();
        while (matcher.find()) list.add(matcher.group(1));
        return list;
    }

    public static String random(String page) {
        List<String> urls = findUrls(page);
        int i = new Random().nextInt(urls.size());
        return urls.get(i);
    }
}