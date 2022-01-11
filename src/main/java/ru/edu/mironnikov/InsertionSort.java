package ru.edu.mironnikov;

/**
 * Date 11.01.2022.
 *
 * @author a.mironnikov
 */
public class InsertionSort {
    static int[] sort(int[] numbers) {
        int in, out;
        for (out = 1; out < numbers.length; out++) {
            int temp = numbers[out];
            in = out;
            while (in > 0 && numbers[in - 1] > temp) {
                numbers[in] = numbers[in - 1];
                in--;
            }
            numbers[in] = temp;
        }
        return numbers;
    }
}
