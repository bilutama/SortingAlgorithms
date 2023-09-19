package Algorithms;

public class HeapSort {
    public static int[] sort(int[] sourceArray) {
        int[] resultArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, resultArray, 0, sourceArray.length);

        // 1 STAGE - initializing a heap on the array
        buildHeap(resultArray);

        // 2 STAGE - swap the first and the last elements of the heap
        // and rebuild the reduced heap sifting down the new root
        for (int i = 0; i < resultArray.length - 1; ++i) {
            int temp = resultArray[0];
            resultArray[0] = resultArray[resultArray.length - i - 1];
            resultArray[resultArray.length - i - 1] = temp;

            siftHeapElementDown(resultArray, 0, resultArray.length - i - 1);
        }

        return resultArray;
    }

    private static void buildHeap(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; --i) {
            siftHeapElementDown(array, i, array.length);
        }
    }

    private static void siftHeapElementDown(int[] array, int heapRoot, int heapLength) {
        int currentRoot = heapRoot;
        int maximumElementIndex = heapRoot;

        while (true) {
            int leftChildIndex = 2 * currentRoot + 1;
            int rightChildIndex = 2 * currentRoot + 2;

            if (leftChildIndex < heapLength && array[leftChildIndex] > array[currentRoot]) {
                maximumElementIndex = leftChildIndex;
            }

            if (rightChildIndex < heapLength && array[rightChildIndex] > array[maximumElementIndex]) {
                maximumElementIndex = rightChildIndex;
            }

            if (currentRoot == maximumElementIndex) {
                break;
            }

            int temp = array[maximumElementIndex];
            array[maximumElementIndex] = array[currentRoot];
            array[currentRoot] = temp;

            currentRoot = maximumElementIndex;
        }
    }
}
