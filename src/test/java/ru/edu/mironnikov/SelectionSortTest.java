package ru.edu.mironnikov;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date 26.10.2021.
 *
 * @author a.mironnikov
 */
public class SelectionSortTest {

    @Test
    public void sort() {
        int[] given = {11, 5, 2, 6, 7, 1, 3, 4};
        int[] result = SelectionSort.sort(given);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 11};
        Assert.assertArrayEquals(expected, result);
    }
}