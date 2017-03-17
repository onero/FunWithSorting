/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

import static funwithsorting.be.ESortStrategy.*;
import funwithsorting.bll.StrategyFacade;

/**
 *
 * @author Adamino
 */
public class FunWithSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StrategyFacade strategyFacade = StrategyFacade.getInstance();

        System.out.println("Array before");
        int[] data = new int[]{5, 3, 6, 2, 1};
        soutArray(data);

        /*
         * You've got following possibilities
         * BUBBLE
         * INSERTION
         * SELECTION
         * MERGE
         * QUICK
         */
        strategyFacade.sortArrayWithStrategy(QUICK, data);

        System.out.println();
        System.out.println("Array after");
        soutArray(data);
    }

    /**
     * Log the data to the console
     *
     * @param arrayToSout
     */
    public static void soutArray(int[] arrayToSout) {
        for (int i = 0; i < arrayToSout.length; i++) {
            System.out.println(arrayToSout[i]);
        }
    }

}
