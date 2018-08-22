package com.brunodles.googleimagesapi;

/**
 * Builder for dynamic query for images API.
 */
public interface QueryBuilder {

    /**
     * Set the wanted image size.
     * It will be used by search tool, but the return may be a image on another size.
     *
     * @param width  the wanted width
     * @param height the wanted height
     * @return return the same instance to continue the parametrization
     */
    QueryBuilder size(int width, int height);

    /**
     * Set the wanted text for search
     *
     * @param query wanted text
     * @return return the same instance to continue the parametrization
     */
    QueryBuilder query(String query);

    /**
     * Execute the search to return the images url.
     *
     * @return a list of urls.
     */
    QueryList<String> listImageUrls();
}
