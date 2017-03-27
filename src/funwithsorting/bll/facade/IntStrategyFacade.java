/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.facade;

import funwithsorting.be.EIntArraySortStrategy;
import funwithsorting.bll.intArray.sorting.ISortIntArrayStrategy;
import funwithsorting.bll.intArray.sorting.strategies.BubbleSort;
import funwithsorting.bll.intArray.sorting.strategies.InsertionSort;
import funwithsorting.bll.intArray.sorting.strategies.MergeSort;
import funwithsorting.bll.intArray.sorting.strategies.QuickSort;
import funwithsorting.bll.intArray.sorting.strategies.SelectionSort;

public class IntStrategyFacade {

    private static IntStrategyFacade instance;

    private ISortIntArrayStrategy bubbleSort;

    private ISortIntArrayStrategy insertionSort;

    private ISortIntArrayStrategy selectionSort;

    private ISortIntArrayStrategy mergeSort;

    private ISortIntArrayStrategy quickSort;

    public static IntStrategyFacade getInstance() {
        if (instance == null) {
            instance = new IntStrategyFacade();
        }
        return instance;
    }

    /**
     * Now we just need the right strategy!...
     *
     * @param strategy
     * @param data
     */
    public void sortIntArrayWithStrategy(EIntArraySortStrategy strategy, int[] data) {
        switch (strategy) {
            case BUBBLE:
                bubbleSort = new BubbleSort();
                bubbleSort.sort(data);
                break;
            case INSERTION:
                insertionSort = new InsertionSort();
                insertionSort.sort(data);
                break;
            case SELECTION:
                selectionSort = new SelectionSort();
                selectionSort.sort(data);
                ;
                break;
            case MERGE:
                mergeSort = new MergeSort();
                mergeSort.sort(data);
                break;
            case QUICK:
                quickSort = new QuickSort();
                quickSort.sort(data);
                break;
            default:
                System.out.println("Are you drunk!?");
        }
    }

}
