package Algorithms;

public class QuickSort {
    public static int[] sort(int[] sourceArray) {
        int[] resultArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, resultArray, 0, sourceArray.length);

        sortSubarray(resultArray, 0, resultArray.length - 1);

        return resultArray;
    }

    private static void sortSubarray(int[] array, int left, int right) {
        if (right < left) {
            return;
        }

        int referenceValue = array[left];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < referenceValue) {
                ++i;
            }

            while (array[j] > referenceValue) {
                --j;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                ++i;
                --j;
            }
        }

        if (i < right) {
            sortSubarray(array, i, right);
        }

        if (j > left) {
            sortSubarray(array, left, j);
        }
    }
}
