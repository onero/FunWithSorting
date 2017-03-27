/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.be;

public class Account implements Comparable<Account> {

    private final int mID;

    private final String mName;

    private final double mBalance;

    public Account(int id, String name, double balance) {
        mID = id;
        mName = name;
        mBalance = balance;
    }

    public int getID() {
        return mID;
    }

    public String getName() {
        return mName;
    }

    public double getBalance() {
        return mBalance;
    }

    @Override
    public int compareTo(Account o) {
        return this.mID - o.getID();
    }
}
