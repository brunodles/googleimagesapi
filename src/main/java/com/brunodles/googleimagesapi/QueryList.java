package com.brunodles.googleimagesapi;

import java.util.ArrayList;
import java.util.Random;

public class QueryList<T> extends ArrayList<T> {
    public T first() {
        return get(0);
    }

    public T random() {
        int i = new Random().nextInt(size());
        return get(i);
    }
}
