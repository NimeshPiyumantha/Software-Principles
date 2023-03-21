package service;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class Girl extends SuperGirl{
    /* This is a low level class, because this class functions are used by another class called Boy*/
    @Override
    public void chat(){
        System.out.println("Hello there...D");
    }
}
