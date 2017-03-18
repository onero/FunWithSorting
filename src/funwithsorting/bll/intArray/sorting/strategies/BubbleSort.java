/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.intArray.sorting.strategies;

import funwithsorting.bll.intArray.sorting.ASortArrayTemplate;

public class BubbleSort extends ASortArrayTemplate {

    /**
     * Sort with bubbleSort
     *
     * @param data
     */
    @Override
    public void sortSpecificWay(int[] data) {
        //For each value in the array
        for (int currentIndexInArray = 0; currentIndexInArray < super.getCurrentMaxIndexOfArray(); currentIndexInArray++) {
            //For value under current value
            for (int valueIndex = 1; valueIndex < (super.getCurrentMaxIndexOfArray() - currentIndexInArray); valueIndex++) {
                //If the value is larger than the value
                if (data[valueIndex - 1] > data[valueIndex]) {
                    swapElements(data, valueIndex);
                }
            }
        }
    }

    private void swapElements(int[] data, int valueIndex) {
        int temp = data[valueIndex - 1];
        //Set new value to check
        data[valueIndex - 1] = data[valueIndex];
        //Save new value
        data[valueIndex] = temp;
    }

}
