/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting;

import funwithsorting.be.Account;
import static funwithsorting.be.EIntArraySortStrategy.*;
import static funwithsorting.be.EObjectSortStrategy.*;
import funwithsorting.bll.facade.IntStrategyFacade;
import funwithsorting.bll.facade.ObjectStrategyFacade;
import funwithsorting.bll.intArray.ArrayFactory;
import funwithsorting.dal.AccountDAO;
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
        IntStrategyFacade strategyFacade = IntStrategyFacade.getInstance();

        System.out.println("Array before");
        int[] data = ArrayFactory.fillArray(10, 1, 10);

        soutArray(data);

        /*
         * You've got following possibilities
         * BUBBLE
         * INSERTION
         * SELECTION
         * MERGE
         * QUICK
         */
        strategyFacade.sortIntArrayWithStrategy(QUICK, data);

        System.out.println();
        System.out.println("Array after");
        soutArray(data);
        System.out.println();

        ObjectStrategyFacade objectStrategyFacade = ObjectStrategyFacade.getInstance();
        AccountDAO dao = new AccountDAO();
        List<Account> accounts = dao.getAccounts();
        System.out.println("Before sort");
        soutObjectArray(accounts);
        System.out.println();

        System.out.println("Natural sort");
        objectStrategyFacade.sortWithObjectSortStrategy(NATURAL, accounts);
        soutObjectArray(accounts);
        System.out.println();

        System.out.println("Name sort");
        objectStrategyFacade.sortWithObjectSortStrategy(NAME, accounts);
        soutObjectArray(accounts);
        System.out.println();

        System.out.println("Balance sort");
        objectStrategyFacade.sortWithObjectSortStrategy(BALANCE, accounts);
        soutObjectArray(accounts);

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

    /**
     * Log the data object to the console
     *
     * @param data
     */
    public static void soutObjectArray(List<Account> data) {
        for (Account account : data) {
            System.out.println(account.getID() + ": " + account.getName() + " " + account.getBalance());
        }
    }
}
