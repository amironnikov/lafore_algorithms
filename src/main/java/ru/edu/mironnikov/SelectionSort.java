package ru.edu.mironnikov;

/**
 * Date 26.10.2021.
 *
 * @author a.mironnikov
 */
public interface SelectionSort {
    static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[minElementIndex] > numbers[j]) {
                    minElementIndex = j;
                }
            }
            if (minElementIndex != i) {
                int temp = numbers[i];
                numbers[i] = numbers[minElementIndex];
                numbers[minElementIndex] = temp;
            }
        }
        return numbers;
    }
}
