package ru.edu.mironnikov;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Date 26.10.2021.
 *
 * @author a.mironnikov
 */
public class BinarySearchTest {

    @Test
    public void testFound() {
        Integer[] given = {10, 2, 5, 6, 7, 1, 3, 4};
        int result = BinarySearch.search(given, 2);
        assertEquals(1, result);
    }

    @Test
    public void testNotFound() {
        Integer[] given = {10, 2, 5, 6, 7, 1, 3, 4};
        int result = BinarySearch.search(given, 11);
        assertEquals(-1, result);
    }
}