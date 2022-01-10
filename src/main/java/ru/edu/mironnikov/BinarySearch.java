package ru.edu.mironnikov;

import java.util.Arrays;

/**
 * Date 20.10.2021.
 *
 * @author a.mironnikov
 */
public interface BinarySearch {
    static int search(Integer[] array, Integer key) {
        Arrays.sort(array);
        int lowerBound = 0;
        int upperBound = array.length - 1;
        while (true) {
            int curIn = (upperBound + lowerBound) / 2;
            if (array[curIn].equals(key)) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return -1;
            } else if (array[curIn] < key) {
                lowerBound = curIn + 1;
            } else {
                upperBound = curIn - 1;
            }
        }
    }
}
