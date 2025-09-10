package oops;
abstract class Parent{
    public Parent(){
        System.out.println("I am a constructor of Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    public abstract void greet();
    public abstract void greet2();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am Good ");
        }
}

public class Abstract {
    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
        c.greet();
        c.greet2();
//        Parent p = new Parent();  --> ERROR
//        Child2 c2 = new Child2();  -->ERROR
        Parent p = new Child();
        p.sayHello();
        p.greet();
        p.greet2();
    }
}
