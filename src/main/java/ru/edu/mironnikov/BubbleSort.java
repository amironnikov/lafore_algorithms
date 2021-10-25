package ru.edu.mironnikov;

import java.util.List;

/**
 * Date 26.10.2021.
 *
 * @author a.mironnikov
 */
public interface BubbleSort {
    static int[] sort(int[] numbers) {
        for (int i = numbers.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                swap(numbers, j);
            }
        }
        return numbers;
    }

    private static void swap(int[] numbers, int index) {
        if (numbers[index] > numbers[index + 1]) {
            int temp = numbers[index];
            numbers[index] = numbers[index + 1];
            numbers[index + 1] = temp;
        }
    }
}
