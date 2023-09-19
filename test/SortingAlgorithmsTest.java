import Algorithms.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;

public class SortingAlgorithmsTest {
    final static int ARRAY_SIZE = 100;
    final static int MAX_RANDOM_VALUE = 1000;

    @Test
    @DisplayName("Bubble sort test")
    void bubbleSortTest() {
        // Given
        int[] inputArray = generateRandomArray();
        int[] expectedSortedArray = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(expectedSortedArray);

        // Sort
        int[] sortedArray = BubbleSort.sort(inputArray);

        // Assert
        Assertions.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    @DisplayName("Heap sort test")
    void heapSortTest() {
        // Given
        int[] inputArray = generateRandomArray();
        int[] expectedSortedArray = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(expectedSortedArray);

        // Sort
        int[] sortedArray = HeapSort.sort(inputArray);

        // Assert
        Assertions.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    @DisplayName("Insertion sort test")
    void insertionSortTest() {
        // Given
        int[] inputArray = generateRandomArray();
        int[] expectedSortedArray = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(expectedSortedArray);

        // Sort
        int[] sortedArray = InsertionSort.sort(inputArray);

        // Assert
        Assertions.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    @DisplayName("Quick sort test")
    void quickSortTest() {
        // Given
        int[] inputArray = generateRandomArray();
        int[] expectedSortedArray = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(expectedSortedArray);

        // Sort
        int[] sortedArray = QuickSort.sort(inputArray);

        // Assert
        Assertions.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    @DisplayName("Selection sort test")
    void selectionSortTest() {
        // Given
        int[] inputArray = generateRandomArray();
        int[] expectedSortedArray = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(expectedSortedArray);

        // Sort
        int[] sortedArray = SelectionSort.sort(inputArray);

        // Assert
        Assertions.assertArrayEquals(expectedSortedArray, sortedArray);
    }

    static int[] generateRandomArray() {
        int[] array = new int[ARRAY_SIZE];
        Random random = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(MAX_RANDOM_VALUE);
        }
        return array;
    }
}
