/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.comarators;

import funwithsorting.be.Account;
import java.util.Comparator;

public class BalanceComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return Double.compare(o1.getBalance(), o2.getBalance());
    }

}
