/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

import funwithsorting.bll.intArray.sorting.ASortArrayTemplate;
import funwithsorting.bll.intArray.sorting.ISortIntArrayStrategy;
import funwithsorting.bll.intArray.sorting.strategies.BubbleSort;
import funwithsorting.bll.intArray.sorting.strategies.InsertionSort;
import funwithsorting.bll.intArray.sorting.strategies.MergeSort;
import funwithsorting.bll.intArray.sorting.strategies.QuickSort;
import funwithsorting.bll.intArray.sorting.strategies.SelectionSort;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 *
 * @author gta1
 */
public class FunWithSortingTest {

    /**
     * Test of bubbleSort method, of class FunWithSorting.
     */
    @Test
    public void testBubbleSort() {

        ISortIntArrayStrategy bubbleSort = new BubbleSort();
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        bubbleSort.sort(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of insertionSort method, of class FunWithSorting.
     */
    @Test
    public void testInsertionSort() {
        ASortArrayTemplate insertionSort = new InsertionSort();
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        insertionSort.sort(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of selectionSort method, of class FunWithSorting.
     */
    @Test
    public void testSelectionSort() {
        ASortArrayTemplate selectionSort = new SelectionSort();
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        selectionSort.sort(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of MergeSort method, of class FunWithSorting.
     */
    @Test
    public void testMergeSort() {
        ASortArrayTemplate mergeSort = new MergeSort();
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        mergeSort.sort(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of MergeSort method, of class FunWithSorting.
     */
    @Test
    public void testQuickSort() {
        ASortArrayTemplate quickSort = new QuickSort();

        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        quickSort.sort(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }
}
