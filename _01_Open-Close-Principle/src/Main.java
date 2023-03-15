import service.Account;
import service.types.CurrentAccount;
import service.types.SalarySaverAccount;
import service.types.SavingAccount;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class Main {
    /*SOLID*/
    /* O - Open / Close Principle */
    /*
     *This principle states that the software entities should be open for extensions but close
     * for modifications
     * */
    public static void main(String[] args) {

        /*BankAppWithdrawalService bankAppWithdrawalService = new BankAppWithdrawalService();

        bankAppWithdrawalService.depositToCurrentAccount(100000);
        bankAppWithdrawalService.withdrawFromCurrentAccount(5000);

        bankAppWithdrawalService.depositToSalarySaverAccount(200000);
        bankAppWithdrawalService.withdrawFromSalarySaverAccount(100000);*/



        /* Let's deposit for Savings Account Bank App Withdrawal Service */
        Account savingAccount= new SavingAccount();
        BankAppWithdrawalService bankAppWithdrawalService1 = new BankAppWithdrawalService(savingAccount);
        bankAppWithdrawalService1.depositToAccount(100000);
        bankAppWithdrawalService1.depositToAccount(40000);


        Account currentAccount= new CurrentAccount();
        BankAppWithdrawalService bankAppWithdrawalService2 = new BankAppWithdrawalService(currentAccount);
        bankAppWithdrawalService2.depositToAccount(200000);
        bankAppWithdrawalService2.depositToAccount(30000);


        Account salaryServer= new SalarySaverAccount();
        BankAppWithdrawalService bankAppWithdrawalService3 = new BankAppWithdrawalService(salaryServer);
        bankAppWithdrawalService3.depositToAccount(500000);
        bankAppWithdrawalService3.depositToAccount(100000);

        /* This is what we called as Open / Close Principle */
    }
}
