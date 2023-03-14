package service;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public abstract class Account {
    /* Extract the basic services and place them here */
    /* Make it abstract because there is nothing to implement here */
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
