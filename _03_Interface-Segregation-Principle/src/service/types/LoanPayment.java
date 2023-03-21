package service.types;

import service.Payment;

import java.util.List;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class LoanPayment implements Payment {
    @Override
    public void initiatePayments() {
        throw new UnsupportedOperationException("Loan Payments don't have Initial Payments");
    }

    /* Now, because the payment interface has changed and more methods were added, all the implementing
    * classes now have to implement the new methods, The problem is, implementing them is unwanted and
    * could lead to many side effects*/

    @Override
    public Object status() {
        return null;
    }

    @Override
    public List<Object> getPayments() {
        return null;
    }

    @Override
    public void initiateLoanSettlement() {
        //Loan settlement logic
    }

    @Override
    public void initiateRePayment() {
        /* Loan repayment logics */
    }
}
