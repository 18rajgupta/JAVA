package oops;

import org.w3c.dom.ls.LSOutput;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();   // UPCASTING     // ALLOWED
//        SmartPhone obj2 = new Phone();   // NOT ALLOWED
        obj.showTime();
        obj.on();
//        obj.music();    // NOT ALLOWED
    }
}
