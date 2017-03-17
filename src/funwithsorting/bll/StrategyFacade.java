/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll;

import funwithsorting.be.ESortStrategy;
import funwithsorting.bll.sorting.ASortCommand;
import funwithsorting.bll.sorting.ASortStrategy;

public class StrategyFacade {

    private static StrategyFacade instance;

    private ASortCommand sortCommand;

    private ASortStrategy bubbleSort;

    private ASortStrategy insertionSort;

    private ASortStrategy selectionSort;

    private ASortStrategy mergeSort;

    private ASortStrategy quickSort;

    public static StrategyFacade getInstance() {
        if (instance == null) {
            instance = new StrategyFacade();
        }
        return instance;
    }

    private StrategyFacade() {
        letsLayDownSomeStrategies();
    }

    /**
     * Now we just need the right strategy!...
     *
     * @param strategy
     * @param data
     */
    public void sortArrayWithStrategy(ESortStrategy strategy, int[] data) {
        switch (strategy) {
            case BUBBLE:
                bubbleSort.doYourMagicThing(data);
                break;
            case INSERTION:
                insertionSort.doYourMagicThing(data);
                break;
            case SELECTION:
                selectionSort.doYourMagicThing(data);
                ;
                break;
            case MERGE:
                mergeSort.doYourMagicThing(data);
                break;
            case QUICK:
                quickSort.doYourMagicThing(data);
                break;
            default:
                System.out.println("Are you drunk!?");
        }
    }

    /**
     * We need some good strategies!
     */
    private void letsLayDownSomeStrategies() {
        sortCommand = new ASortCommand();

        bubbleSort = sortCommand.getStrategy(ESortStrategy.BUBBLE);

        insertionSort = sortCommand.getStrategy(ESortStrategy.INSERTION);

        selectionSort = sortCommand.getStrategy(ESortStrategy.SELECTION);

        mergeSort = sortCommand.getStrategy(ESortStrategy.MERGE);

        quickSort = sortCommand.getStrategy(ESortStrategy.QUICK);
    }

}
