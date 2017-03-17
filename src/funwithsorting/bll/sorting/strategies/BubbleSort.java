/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.sorting.strategies;

import funwithsorting.bll.sorting.ASortStrategy;

public class BubbleSort extends ASortStrategy {

    /**
     * Sort with bubbleSort
     *
     * @param data
     * @return
     */
    @Override
    public void sort(int[] data) {
        //For each value in the array
        for (int i = 0; i < super.getCurrentMaxIndexOfArray(); i++) {
            //For value under current value
            for (int j = 1; j < (super.getCurrentMaxIndexOfArray() - i); j++) {
                //If the value is larger than the value
                if (data[j - 1] > data[j]) {
                    swapElements(data, j);
                }
            }
        }
    }

    private void swapElements(int[] data, int j) {
        int temp = data[j - 1];
        //Set new value to check
        data[j - 1] = data[j];
        //Save new value
        data[j] = temp;
    }

}
