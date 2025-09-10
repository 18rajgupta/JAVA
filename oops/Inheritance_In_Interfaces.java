package oops;
interface SampleInterface{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements ChildSampleInterface{
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
}

public class Inheritance_In_Interfaces {
    public static void main(String[] args) {
        MySampleClass my = new MySampleClass();
        my.meth1();
        my.meth2();
        my.meth3();
        my.meth4();
    }
}
