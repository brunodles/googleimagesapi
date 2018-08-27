package com.brunodles.googlesearchapi

/**
 * Search APi.
 * <p>This will help to decode the content of search result.
 */
object SearchApi {

    /**
     * Build a query to make a search on google search.
     *
     * @param pageFetcher need to fetch the page
     * @return a QueryBuilder to change search parameters
     */
    fun queryBuilder(pageFetcher: PageFetcher): QueryBuilder =
            QueryBuilderImpl(pageFetcher)
}