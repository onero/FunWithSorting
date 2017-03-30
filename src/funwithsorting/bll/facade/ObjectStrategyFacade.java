/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.facade;

import funwithsorting.be.Account;
import funwithsorting.be.EObjectSortComparator;
import funwithsorting.bll.comarators.BalanceComparator;
import funwithsorting.bll.comarators.NameComparator;
import funwithsorting.bll.objectArray.sorting.strategies.SortObjectArrayWithComparator;
import java.util.Collections;
import java.util.List;

public class ObjectStrategyFacade {

    private static ObjectStrategyFacade instance;
    private final SortObjectArrayWithComparator sorter;

    public static ObjectStrategyFacade getInstance() {
        if (instance == null) {
            instance = new ObjectStrategyFacade();
        }
        return instance;
    }

    private ObjectStrategyFacade() {
        sorter = new SortObjectArrayWithComparator();
    }

    public void sortWithObjectSortComparator(List<Account> data, EObjectSortComparator comparator) {
        switch (comparator) {
            case NATURAL:
                Collections.sort(data);
                break;
            case NAME:
                sorter.sort(data, new NameComparator());
                break;
            case BALANCE:
                sorter.sort(data, new BalanceComparator());
                break;
            default:
                System.out.println("Got no strategy!?");
        }
    }

}
