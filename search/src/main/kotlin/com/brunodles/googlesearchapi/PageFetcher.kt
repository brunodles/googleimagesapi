package com.brunodles.googlesearchapi

/**
 * Fetch pages for a determined Url
 */
interface PageFetcher {
    /**
     * Fetch the url and return it as a String
     *
     * @param url the wanted url
     * @return the page as String
     */
    fun fetchPage(url: String): String
}
