/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.intArray;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author gta1
 */
public class ArrayFactoryTest {

    public ArrayFactoryTest() {
    }

    @Test
    public void testFillArray() {
        int size = 10;
        int minValue = 1;
        int maxValue = 10;
        int[] result = ArrayFactory.fillArray(size, minValue, maxValue);
        assertTrue(result.length > 0);
    }

    @Test
    public void testFillSortedArray() {
        int size = 10;
        int minValue = 1;
        int maxValue = 10;
        int[] result = ArrayFactory.fillSortedArray(size, minValue, maxValue);
        assertTrue(result[0] < result[result.length - 1]);
    }

}
