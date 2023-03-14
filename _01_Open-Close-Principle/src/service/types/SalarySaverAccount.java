package service.types;

import service.Account;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class SalarySaverAccount extends Account {
    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Salary Saver Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from Salary Saver Account.!");
    }
}
