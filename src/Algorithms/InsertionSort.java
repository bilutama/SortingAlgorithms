package Algorithms;

public class InsertionSort {
    public static int[] sort(int[] sourceArray) {
        int[] resultArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, resultArray, 0, sourceArray.length);

        for (int i = 1; i < resultArray.length; ++i) {
            if (resultArray[i - 1] > resultArray[i]) {
                int j = i - 1;
                int temp = resultArray[i];

                do {
                    resultArray[j + 1] = resultArray[j];
                    --j;
                } while (j >= 0 && temp < resultArray[j]);

                resultArray[j + 1] = temp;
            }
        }

        return resultArray;
    }
}
