import service.Account;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class BankAppWithdrawalService {

    Account account;

    public BankAppWithdrawalService(Account account) {
        this.account = account;
    }

    public void depositToAccount(double amount){
        account.deposit(amount);
    }
    public void withdrawFromAccount(double amount){
        account.withdraw(amount);
    }


}
