package service.types;

import service.custom.Withdrawable;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class SavingAccount extends Withdrawable {
    @Override
    public void deposit(double amount) {
        System.out.println(amount + " Deposited to your Savings Account.!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(amount + " Withdrawn from your Savings Account.!");
    }
}
