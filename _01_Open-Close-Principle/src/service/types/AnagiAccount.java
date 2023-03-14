package service.types;

import service.Account;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class AnagiAccount extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println("Deposit for Anagi Account " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw from Anagi Account " + amount);
    }
}
