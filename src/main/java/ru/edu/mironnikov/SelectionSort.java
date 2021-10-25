package ru.edu.mironnikov;

/**
 * Date 26.10.2021.
 *
 * @author a.mironnikov
 */
public interface SelectionSort {
    static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }
}
