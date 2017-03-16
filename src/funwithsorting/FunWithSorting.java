/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adamino
 */
public class FunWithSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Array before");
        int[] unsortedArray = new int[]{5, 3, 6, 2, 1};
        soutArray(unsortedArray);

        System.out.println("Array after");
        List<Long> timeStamps = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            MyTimer.start();
            int[] bubbleSortedArray = selectionSort(unsortedArray);
//            soutArray(bubbleSortedArray);
            MyTimer.stop();
            timeStamps.add(MyTimer.getTimeInMillis());
            MyTimer.reset();
        }
        long totalValue = 0;
        for (Long timeStamp : timeStamps) {
            totalValue += timeStamp;
        }

        long result = totalValue / timeStamps.size();

        System.out.println("");
        System.out.println("Time");
        System.out.println(result);

        /*System.out.println("Array shuffled");
        soutArray(ArrayShuffler.shuffleArray(unsortedArray));*/

 /*int[] selectionSortedArray = insertionSort(unsortedArray);
        System.out.println("Array after");
        soutArray(selectionSortedArray);*/
    }

    public static void soutArray(int[] arrayToSout) {
        for (int i = 0; i < arrayToSout.length; i++) {
            System.out.println(arrayToSout[i]);
        }
    }

    /**
     * Get the sorted array
     *
     * @param data
     * @return
     */
    public static int[] bubbleSort(int[] data) {

        //Get a hold of the length
        int n = data.length;
        //Create temp value
        int temp;

        //For each value in the array
        for (int i = 0; i < n; i++) {
            //For value under current value
            for (int j = 1; j < (n - i); j++) {
                //If the value is larger than the value
                if (data[j - 1] > data[j]) {
                    swapElements(data, j);
                }
            }
        }
        return data;
    }

    private static void swapElements(int[] data, int j) {
        int temp;
        //swap the elements!
        temp = data[j - 1];
        //Set new value to check
        data[j - 1] = data[j];
        //Save new value
        data[j] = temp;
    }

    /**
     * Get the sorted array
     *
     * @param data
     * @return
     */
    public static int[] insertionSort(int[] data) {
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
        return data;
    }

    /**
     * Get the sorted array
     *
     * @param data
     * @return
     */
    public static int[] selectionSort(int[] data) {
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

        return data;
    }

}
