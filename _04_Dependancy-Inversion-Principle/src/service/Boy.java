package service;

/**
 * @author : Nimesh Piyumantha
 * @since : 0.1.0
 **/
public class Boy {
    public void chatWithGirl(){
        Girl girl = new Girl();
        girl.chat();
    }
    /*The classes which are performing tasks with the help of other classes are known as High Level Classes
    * Boy class is using the help of Girl class to perform chat with girl task
    * So boy is a High Level Class.
    *
    * So what Dependency Inversion Principle Emphasize on.?
    * High level modules should not depend upon low level modules. So here we are violating it.
    *
    * So, then what we should do.?
    * Both should depend upon abstraction
    * */
}
