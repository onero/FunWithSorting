/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.ObjectArray.sorting.strategies;

import funwithsorting.be.Account;
import funwithsorting.bll.ObjectArray.sorting.ISortObjectArrayStrategy;
import funwithsorting.bll.comarators.NameComparator;
import java.util.Collections;
import java.util.List;

public class SortOnNameStrategy implements ISortObjectArrayStrategy<Account> {

    @Override
    public void sort(List<Account> data) {
        Collections.sort(data, new NameComparator());
    }

}
