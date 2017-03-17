/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.sorting;

import funwithsorting.be.ESortStrategy;
import funwithsorting.bll.sorting.strategies.BubbleSort;
import funwithsorting.bll.sorting.strategies.InsertionSort;
import funwithsorting.bll.sorting.strategies.MergeSort;
import funwithsorting.bll.sorting.strategies.QuickSort;
import funwithsorting.bll.sorting.strategies.SelectionSort;

public class ASortCommand {

    public ASortStrategy getStrategy(ESortStrategy strategy) {
        switch (strategy) {
            case BUBBLE:
                return new BubbleSort();
            case INSERTION:
                return new InsertionSort();
            case SELECTION:
                return new SelectionSort();
            case MERGE:
                return new MergeSort();
            case QUICK:
                return new QuickSort();
            default:
                System.out.println("Ain't got no strategy!");
        }
        return null;
    }

}
