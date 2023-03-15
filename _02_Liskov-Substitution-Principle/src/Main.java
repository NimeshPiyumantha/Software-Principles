import service.custom.Fixed;
import service.custom.Withdrawable;
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
        Withdrawable savingAccount = new SavingAccount();

        BankAppWithdrawalService bankAppWithdrawalService1 = new BankAppWithdrawalService(savingAccount);
        bankAppWithdrawalService1.depositToAccount(100000);
        bankAppWithdrawalService1.withdrawFromAccount(40000);

        /*Super class*/           /*Sub Class */
        Withdrawable currentAccount = new CurrentAccount();

        BankAppWithdrawalService bankAppWithdrawalService2 = new BankAppWithdrawalService(currentAccount);
        bankAppWithdrawalService2.depositToAccount(200000);
        bankAppWithdrawalService2.withdrawFromAccount(30000);


        /*Super class*/           /*Sub Class */
        Withdrawable salaryServer = new SalarySaverAccount();

        BankAppWithdrawalService bankAppWithdrawalService3 = new BankAppWithdrawalService(salaryServer);
        bankAppWithdrawalService3.depositToAccount(500000);
        bankAppWithdrawalService3.withdrawFromAccount(100000);


        /* Let's focus on this case */
        /*Super class*/           /*Sub Class */
        Fixed fixedAccount = new FixedAccount(); // Now everything ok

        BankAppFixedDepositService bankAppWithdrawalService4 = new BankAppFixedDepositService(fixedAccount);
        bankAppWithdrawalService4.depositToAccount(1500000); // This is totally fine
        //bankAppWithdrawalService4.withdrawFromAccount(100000);// Now this feature is not available for fixed account holder

        /*
         * To sum up,
         * objects of a superclass shall be replaceable with
         * Objects of its subclasses without breaking the application.
         * Now it is achievable.
         * */

    }
}
