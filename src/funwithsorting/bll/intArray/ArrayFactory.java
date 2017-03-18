/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.intArray;

import java.util.Arrays;
import java.util.Random;

public class ArrayFactory {

    /**
     * Fill up int[size] with parsed values
     *
     * @param size
     * @param minValue
     * @param maxValue
     * @return
     */
    public static int[] fillArray(int size, int minValue, int maxValue) {
        Random rnd = new Random();
        return fillArray(size, minValue, maxValue, rnd.nextInt());
    }

    /**
     * Create an int[size] with random values
     *
     * @param size
     * @param minValue
     * @param maxValue
     * @param seed
     * @return
     */
    private static int[] fillArray(int size, int minValue, int maxValue, int seed) {
        int[] tmp = new int[size];
        Random random = new Random(seed);
        for (int i = 0; i < size; i++) {
            tmp[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        return tmp;
    }

    /**
     * Fill up sorted int[size] with parsed values
     *
     * @param size
     * @param minValue
     * @param maxValue
     * @return
     */
    public static int[] fillSortedArray(int size, int minValue, int maxValue) {
        Random rnd = new Random();
        return fillSortedArray(size, minValue, maxValue, rnd.nextInt());
    }

    /**
     * Create a sorted int[size] with random values
     *
     * @param size
     * @param minValue
     * @param maxValue
     * @param seed
     * @return
     */
    private static int[] fillSortedArray(int size, int minValue, int maxValue, int seed) {
        int[] tmp = fillArray(size, minValue, maxValue, seed);
        Arrays.parallelSort(tmp);
        return tmp;
    }

}
