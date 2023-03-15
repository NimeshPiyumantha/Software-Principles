import service.custom.Fixed;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class BankAppFixedDepositService {

    Fixed account;

    public BankAppFixedDepositService(Fixed account) {
        this.account = account;
    }

    public void depositToAccount(double amount){
        account.deposit(amount);
    }
}
