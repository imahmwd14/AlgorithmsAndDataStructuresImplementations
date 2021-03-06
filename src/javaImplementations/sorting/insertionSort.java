package javaImplementations.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = IntStream
                .generate(() -> (int) (Math.random() * 50))
                .limit(10)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    // a demonstration of an exceptional level of...
    static void insertionSort(int[] arr) {
        for (int n = arr.length, i = 0, j = i + 1, value = arr[j]; i < n - 1; arr[j] = value, ++i, j = i + 1, value = j < n ? arr[j] : 0)
            while (j > 0 && value < arr[j - 1]) arr[j] = arr[--j];
    }
}
