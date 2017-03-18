/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.shuffling;

import java.util.Random;

public class ArrayShuffler {

    public static int[] shuffleArray(int[] arrayToShuffle) {
        Random rnd = new Random();
        for (int i = arrayToShuffle.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = arrayToShuffle[index];
            arrayToShuffle[index] = arrayToShuffle[i];
            arrayToShuffle[i] = a;
        }
        return arrayToShuffle;
    }

}
