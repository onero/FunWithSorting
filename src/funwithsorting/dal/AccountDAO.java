/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.dal;

import funwithsorting.be.Account;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    private final List<Account> accounts;

    public AccountDAO() {
        accounts = new ArrayList<>();
        accounts.add(new Account(1, "Checking", 1000));
        accounts.add(new Account(3, "Saving", 15000));
        accounts.add(new Account(2, "Loan", -15000));
    }

    public List<Account> getAccounts() {
        return accounts;
    }

}
