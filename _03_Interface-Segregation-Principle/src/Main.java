import service.Payment;
import service.cutom.Bank;
import service.cutom.Loan;
import service.types.BankPayment;
import service.types.LoanPayment;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class Main {
    /* SOLID  */
    /* I - Interface Segregation Principle */

    /*
     * This principle states that clients should not be forced to depend upon interfaces that
     * they don't use
     * */

    public static void main(String[] args) {

        Bank payment = new BankPayment();
        payment.initiatePayments();
        payment.status();
        payment.status();
        payment.getPayments();

        /* Now these methods are unwanted methods and also will lead errors */
        /* payment.initiateLoanSettlement();
         * payment.initiateRePayment();
         */  // now these are now allowed

        Loan loan = new LoanPayment();
        //loan.initiatePayments();
        loan.status();
        loan.status();
        loan.getPayments();

        loan.initiateLoanSettlement();
        loan.initiateRePayment();

        /* Now  clients are not be forced to depend upon interfaces that
         * they don't use */
    }
}
