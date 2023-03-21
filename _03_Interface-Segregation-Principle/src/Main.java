import service.Payment;
import service.types.BankPayment;

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

        Payment payment = new BankPayment();
        payment.initiatePayments();
        payment.status();
        payment.status();
        payment.getPayments();
    }
}
