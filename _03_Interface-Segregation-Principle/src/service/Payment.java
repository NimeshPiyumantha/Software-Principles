package service;

import java.util.List;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();
}
