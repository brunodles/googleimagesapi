package com.brunodles.googleimagesapi;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Image search Api.<p/>
 * This will help to seach for images using google search api.<p/>
 * Use {@link #queryBuilder(PageFetcher)} to start a search.
 */
public final class ImagesApi {

    private static final Pattern URL_PATTERN = Pattern.compile("\"ou\":\"(https?:.+?)\"");

    private ImagesApi() {
    }

    /**
     * Provide a {@link PageFetcher} to fetch the page from where you want.
     *
     * @param pageFetcher need to fetch the page
     * @return a QueryBuilder to change search parameters
     */
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
