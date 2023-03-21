package service.cutom;

import service.Payment;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public interface Bank extends Payment {
    void initiatePayments();
}
