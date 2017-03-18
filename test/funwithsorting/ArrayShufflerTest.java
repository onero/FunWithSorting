/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

import funwithsorting.bll.shuffling.ArrayShuffler;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author gta1
 */
public class ArrayShufflerTest {

    public ArrayShufflerTest() {
    }

    /**
     * Test of shuffleArray method, of class ArrayShuffler.
     */
    @Test
    public void testShuffleArray() {
        int[] arrayToShuffle = new int[]{5, 2, 3, 1, 6};

        int[] result = ArrayShuffler.shuffleArray(arrayToShuffle);

        assertArrayEquals(arrayToShuffle, result);
    }

}
