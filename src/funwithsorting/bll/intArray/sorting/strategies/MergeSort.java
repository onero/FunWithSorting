/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.intArray.sorting.strategies;

import funwithsorting.bll.intArray.sorting.ASortArrayTemplate;

public class MergeSort extends ASortArrayTemplate {

    private int[] arrayBeingSorted;

    private int[] helperArray;

    @Override
    public void sortSpecificWay(int[] data) {
        arrayBeingSorted = data;
        helperArray = new int[data.length];
        int low = 0, high = super.getCurrentMaxIndexOfArray() - 1;
        mergeSort(low, high);
    }

    /**
     * Sort the Array using MergeSort
     *
     * @param low
     * @param high
     */
    private void mergeSort(int low, int high) {
        // check if low is smaller then high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergeSort(low, middle);
            // Sort the right side of the array
            mergeSort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    /**
     * Merge the two arrays
     *
     * @param low
     * @param middle
     * @param high
     */
    private void merge(int low, int middle, int high) {
        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helperArray[i] = arrayBeingSorted[i];
        }
        int currentLowValue = low;
        int currentMiddleValue = middle + 1;
        int lowIndex = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (currentLowValue <= middle && currentMiddleValue <= high) {
            if (helperArray[currentLowValue] <= helperArray[currentMiddleValue]) {
                arrayBeingSorted[lowIndex] = helperArray[currentLowValue];
                currentLowValue++;
            } else {
                arrayBeingSorted[lowIndex] = helperArray[currentMiddleValue];
                currentMiddleValue++;
            }
            lowIndex++;
        }
        // Copy the rest of the left side of the array into the target array
        while (currentLowValue <= middle) {
            arrayBeingSorted[lowIndex] = helperArray[currentLowValue];
            lowIndex++;
            currentLowValue++;
        }

    }

}
