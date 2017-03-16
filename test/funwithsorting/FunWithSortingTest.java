/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

/**
 *
 * @author gta1
 */
public class FunWithSortingTest {

    public FunWithSortingTest() {
    }

    /**
     * Test of bubbleSort method, of class FunWithSorting.
     */
    @Test
    public void testBubbleSort() {
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        int[] result = FunWithSorting.bubbleSort(data);

        assertArrayEquals(expResult, result);
    }

    /**
     * Test of insertionSort method, of class FunWithSorting.
     */
    @Test
    public void testInsertionSort() {
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        int[] result = FunWithSorting.bubbleSort(data);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of selectionSort method, of class FunWithSorting.
     */
    @Test
    public void testSelectionSort() {
        int[] data = new int[]{5, 2, 3, 1, 6};
        int[] expResult = new int[]{1, 2, 3, 5, 6};

        int[] result = FunWithSorting.bubbleSort(data);
        assertArrayEquals(expResult, result);
    }
}
