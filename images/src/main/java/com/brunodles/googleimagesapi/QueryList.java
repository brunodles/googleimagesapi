package com.brunodles.googleimagesapi;

import java.util.ArrayList;
import java.util.Random;

/**
 * A class to provide fluent access to a common list.
 *
 * @param <T> the item type
 */
public class QueryList<T> extends ArrayList<T> {

    /**
     * Simple access to the first item on the list
     * <p>
     * May throws {@link IndexOutOfBoundsException}
     *
     * @return the first item on the list
     */
    public T first() {
        return get(0);
    }

    /**
     * Simple access to a random item on the list
     * <p>
     * May throws {@link IndexOutOfBoundsException}
     *
     * @return a random item from the list
     */
    public T random() {
        int i = new Random().nextInt(size());
        return get(i);
    }
}
