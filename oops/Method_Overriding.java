package oops;
class A{
    public void meth1(int a){
        System.out.println("I am a method 1 of claass A");
    }
}
class B extends A{
    @Override
    public void meth1(int a){
        System.out.println("I am a method 1 of class B");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1(10);

        B b = new B();
        b.meth1(20);
    }
}
