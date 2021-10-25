package ru.edu.mironnikov;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date 26.10.2021.
 *
 * @author a.mironnikov
 */
public class BubbleSortTest {

    @Test
    public void sort() {
        int[] given = {10, 2, 5, 6, 7, 1, 3, 4};
        int[] result = BubbleSort.sort(given);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 10};
        Assert.assertArrayEquals(expected, result);
    }
}