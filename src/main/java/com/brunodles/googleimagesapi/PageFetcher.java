package com.brunodles.googleimagesapi;

/**
 * Fetch pages for a determined Url
 */
public interface PageFetcher {
    /**
     * Fetch the url and return it as a String
     *
     * @param url the wanted url
     * @return the page as String
     */
    String fetchPage(String url);
}
