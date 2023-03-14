import service.Account;
import service.types.CurrentAccount;
import service.types.FixedAccount;
import service.types.SalarySaverAccount;
import service.types.SavingAccount;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class Main {
    /*SOLID*/
    /* L - Liskov-Substitution Principle */
    /*
     * This principle states that the objects of a superclass shall be replaceable with
     * Objects of its subclasses without breaking the application
     *
     * */
    public static void main(String[] args) {

        /* According to Liskov-Substitution principle
         * objects of a superclass shall be replaceable with
         * Objects of its subclasses without breaking the application*/
        Account savingAccount = new SavingAccount();

        BankAppWithdrawalService bankAppWithdrawalService1 = new BankAppWithdrawalService(savingAccount);
        bankAppWithdrawalService1.depositToAccount(100000);
        bankAppWithdrawalService1.withdrawFromAccount(40000);

        /*Super class*/           /*Sub Class */
        Account currentAccount = new CurrentAccount();

        BankAppWithdrawalService bankAppWithdrawalService2 = new BankAppWithdrawalService(currentAccount);
        bankAppWithdrawalService2.depositToAccount(200000);
        bankAppWithdrawalService2.withdrawFromAccount(30000);


        /*Super class*/           /*Sub Class */
        Account salaryServer = new SalarySaverAccount();

        BankAppWithdrawalService bankAppWithdrawalService3 = new BankAppWithdrawalService(salaryServer);
        bankAppWithdrawalService3.depositToAccount(500000);
        bankAppWithdrawalService3.withdrawFromAccount(100000);


        /* Let's focus on this case */
        /*Super class*/           /*Sub Class */
        Account fixedAccount = new FixedAccount(); // feels like ok
        /* This is not ok, because it's breaking the application structure by doing this */

        BankAppWithdrawalService bankAppWithdrawalService4 = new BankAppWithdrawalService(fixedAccount);
        bankAppWithdrawalService4.depositToAccount(1500000); // This is totally fine
        bankAppWithdrawalService4.withdrawFromAccount(100000);// But this one..? // fixed account should not support for this feature

        /*
         * In here there is an issue. though there is no compile error on the code, we have already violated
         * the liskov-substitution principle
         * How.?
         * In liskov-Substitution principle it emphasizes that objects of a superclass shall be replaceable with
         * Objects of its subclasses without breaking the application. In here by replacing FixedAccount for its
         * Super Class Account, it's breaking the application structure, because fixed accounts don't own withdraw option
         * So it's violating the Liskov-Substitution Principle
         * */
    }
}
