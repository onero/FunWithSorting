/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

import funwithsorting.be.ESortStrategy;
import funwithsorting.bll.sorting.ASortCommand;
import funwithsorting.bll.sorting.ASortStrategy;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author gta1
 */
public class FunWithSortingTest {

    private ASortCommand sortCommand;

    @Before
    public void setUp() {
        sortCommand = new ASortCommand();
    }

    /**
     * Test of bubbleSort method, of class FunWithSorting.
     */
    @Test
    public void testBubbleSort() {

        ASortStrategy bubbleSort = sortCommand.getStrategy(ESortStrategy.BUBBLE);
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        bubbleSort.doYourMagicThing(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of insertionSort method, of class FunWithSorting.
     */
    @Test
    public void testInsertionSort() {
        ASortStrategy insertionSort = sortCommand.getStrategy(ESortStrategy.INSERTION);
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        insertionSort.doYourMagicThing(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of selectionSort method, of class FunWithSorting.
     */
    @Test
    public void testSelectionSort() {
        ASortStrategy selectionSort = sortCommand.getStrategy(ESortStrategy.SELECTION);
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        selectionSort.doYourMagicThing(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of MergeSort method, of class FunWithSorting.
     */
    @Test
    public void testMergeSort() {
        ASortStrategy mergeSort = sortCommand.getStrategy(ESortStrategy.MERGE);
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        mergeSort.doYourMagicThing(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of MergeSort method, of class FunWithSorting.
     */
    @Test
    public void testQuickSort() {
        ASortStrategy quickSort = sortCommand.getStrategy(ESortStrategy.QUICK);

        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        quickSort.doYourMagicThing(data);

        int[] result = data;
        assertArrayEquals(expResult, result);
    }
}
