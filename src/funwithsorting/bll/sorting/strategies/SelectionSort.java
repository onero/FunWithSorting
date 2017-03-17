/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.sorting.strategies;

import funwithsorting.bll.sorting.ASortStrategy;

public class SelectionSort extends ASortStrategy {

    @Override
    public void sort(int[] data) {
        validateArray(data);
        //For each value in the array
        for (int i = 0; i < data.length - 1; i++) {
            //Set current index
            int index = i;
            //For each value after current value in array
            for (int j = i + 1; j < data.length; j++) {
                //If the current value is smaller than the index value
                if (data[j] < data[index]) {
                    //Set index to be this value
                    index = j;
                }
            }
            //Set the smallerNumber to be the index value
            int smallerNumber = data[index];
            //Set the current index value in the array to be index i of the array
            data[index] = data[i];
            //The current intex in the array should be the smallest number
            data[i] = smallerNumber;
        }
    }

}
