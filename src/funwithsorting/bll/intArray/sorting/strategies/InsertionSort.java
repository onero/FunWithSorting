/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.intArray.sorting.strategies;

import funwithsorting.bll.intArray.sorting.ASortArrayTemplate;

public class InsertionSort extends ASortArrayTemplate {

    @Override
    public void sortSpecificWay(int[] data) {
        validateArray(data);
        int arrayPosition;
        int key;
        int value;
        // Start with 1 (not 0)
        for (arrayPosition = 1; arrayPosition < data.length; arrayPosition++) {
            key = data[arrayPosition];
            // Smaller values are moving up
            for (value = arrayPosition - 1; (value >= 0) && (data[value] > key); value--) {
                data[value + 1] = data[value];
            }
            // Put the key in its proper location
            data[value + 1] = key;
        }
    }

}
