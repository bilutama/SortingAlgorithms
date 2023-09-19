import Algorithms.*;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray(15, 100);
        System.out.println("The initial array:");
        System.out.println(Arrays.toString(array));


        System.out.println("*** Bubble Sort ***");
        System.out.println(Arrays.toString(BubbleSort.sort(array)));

        System.out.println("*** Insertion Sort ***");
        System.out.println(Arrays.toString(InsertionSort.sort(array)));

        System.out.println("*** Quick Sort ***");
        System.out.println(Arrays.toString(QuickSort.sort(array)));

        System.out.println("*** Selection Sort ***");
        System.out.println(Arrays.toString(SelectionSort.sort(array)));

        System.out.println("*** Heap Sort ***");
        System.out.println(Arrays.toString(HeapSort.sort(array)));
    }

    private static int[] generateRandomArray(final int size, final int maxValue) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValue);
        }
        return array;
    }
}