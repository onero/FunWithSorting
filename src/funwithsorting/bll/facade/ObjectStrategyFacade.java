/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.facade;

import funwithsorting.be.Account;
import funwithsorting.be.EObjectSortStrategy;
import funwithsorting.bll.ObjectArray.sorting.ISortObjectArrayStrategy;
import funwithsorting.bll.ObjectArray.sorting.strategies.NaturalSortStrategy;
import funwithsorting.bll.ObjectArray.sorting.strategies.SortOnBalanceStrategy;
import funwithsorting.bll.ObjectArray.sorting.strategies.SortOnNameStrategy;
import java.util.List;

public class ObjectStrategyFacade {

    private static ObjectStrategyFacade instance;

    private ISortObjectArrayStrategy sortingStrategy;

    public static ObjectStrategyFacade getInstance() {
        if (instance == null) {
            instance = new ObjectStrategyFacade();
        }
        return instance;
    }

    public void sortWithObjectSortStrategy(EObjectSortStrategy strategy, List<Account> data) {
        switch (strategy) {
            case NATURAL:
                sortingStrategy = new NaturalSortStrategy();
                break;
            case NAME:
                sortingStrategy = new SortOnNameStrategy();
                break;
            case BALANCE:
                sortingStrategy = new SortOnBalanceStrategy();
                break;
            default:
                System.out.println("Got no strategy!?");
        }
        if (sortingStrategy != null) {
            sortingStrategy.sort(data);
        }
    }

}
