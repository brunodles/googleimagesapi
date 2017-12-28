# googleimagesapi
A simple project to grab images from google images search

## What does it do?
Get images from _google images search_.

## Why?
To use context related images.

## How to use?

### Implement a PageFetcher
This page fetcher is a simple interface to **fetch pages**.

The idea is to not embed this lib a HTTP client, so you can use any http client to do the job.

The interface just have a single method `fetchPage`, receiving a url and return the page as a String.

**Sample implementation using OkHttp**
```java
public static class OkHttpPageFetcher implements PageFetcher {
    @Override
    public String fetchPage(String url) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                // Try to keep this reader, may google change the result depending on User-Agent
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36")
                .build();
        try {
            Response response = client.newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            return "";
        }
    }
}
```

### Using the ImagesApi
The main class is the `ImagesApi`, with it you will be able to use this lib.

It have just one method `queryBuilder`, with it you create your query to *google image search engine*.

**Sample usage**
```java
// Build your query
QueryList<String> result = ImagesApi.queryBuilder(new OkHttpPageFetcher())
                .size(800, 600) // wanted image size
                .query("emo girl") // text to search
                .listImagesUrls(); // execute the search, returns list of URLs
```

The code above returns a custom list implementation, it just adds two new methods to provide a fluent interface.
With it you can access the first item or a random item on the list.

```java
result.first() // will return the first url
result.random() // will return a random url
```


## Some similar services
This app was inspired by these services, but they search on their database.
Sometimes they doesn't have images for wanted context.

* [Lorem Pixel](http://lorempixel.com/)
* [Place Hold It](http://placehold.it/)
* [Place Hold Jp](http://placehold.jp/en.html)
* [Place Kitten](http://placekitten.com/)

## Especial Thanks
* Google Images