package service.custom;

import service.Account;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public abstract class Withdrawable extends Account {
    public abstract void withdraw(double amount);
}
