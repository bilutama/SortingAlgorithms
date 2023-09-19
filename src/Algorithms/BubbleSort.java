package Algorithms;

public class BubbleSort {
    public static int[] sort(int[] sourceArray) {
        int[] resultArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, resultArray, 0, sourceArray.length);

        for (int i = 0; i < resultArray.length - 1; ++i) {
            int minimumElementIndex = i;

            for (int j = minimumElementIndex + 1; j < resultArray.length; ++j) {
                if (resultArray[j] < resultArray[minimumElementIndex]) {
                    minimumElementIndex = j;
                }
            }

            int temp = resultArray[minimumElementIndex];
            resultArray[minimumElementIndex] = resultArray[i];
            resultArray[i] = temp;
        }

        return resultArray;
    }
}
