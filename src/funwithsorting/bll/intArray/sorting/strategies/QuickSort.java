/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.intArray.sorting.strategies;

import funwithsorting.bll.intArray.sorting.ASortArrayTemplate;

public class QuickSort extends ASortArrayTemplate {

    private int[] arrayBeingSorted;

    @Override
    public void sortSpecificWay(int[] data) {
        arrayBeingSorted = data;
        int low = 0, high = super.getCurrentMaxIndexOfArray() - 1;
        quicksort(low, high);
    }

    /**
     * Sort the array with QuickSort
     *
     * @param low
     * @param high
     */
    private void quicksort(int low, int high) {
        int currentLowIndex = low, currentHighIndex = high;
        // Get the pivot element from the middle of the list
        int pivotPoint = arrayBeingSorted[low + (high - low) / 2];

        // Divide into two lists
        while (currentLowIndex <= currentHighIndex) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (arrayBeingSorted[currentLowIndex] < pivotPoint) {
                currentLowIndex++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (arrayBeingSorted[currentHighIndex] > pivotPoint) {
                currentHighIndex--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (currentLowIndex <= currentHighIndex) {
                swap(currentLowIndex, currentHighIndex);
                currentLowIndex++;
                currentHighIndex--;
            }
        }
        // Recursion
        if (low < currentHighIndex) {
            quicksort(low, currentHighIndex);
        }
        if (currentLowIndex < high) {
            quicksort(currentLowIndex, high);
        }
    }

    /**
     * Swap to elements
     *
     * @param firstValue
     * @param secondvalue
     */
    private void swap(int firstValue, int secondvalue) {
        int temp = arrayBeingSorted[firstValue];
        arrayBeingSorted[firstValue] = arrayBeingSorted[secondvalue];
        arrayBeingSorted[secondvalue] = temp;
    }

}
