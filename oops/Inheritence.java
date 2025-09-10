package oops;
class Base{
    int x;

    Base(){
        System.out.println("I am a base constructor...");
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a cunstructor");
    }
}
class Derived extends Base{
    int y;

    Derived(){
        System.out.println("I am a derived constructor...");
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Base b = new Base();
//        b.printMe();
//        b.setX(12);
//        System.out.println(b.getX());

        Derived d = new Derived();
//        d.printMe();
//        d.setX(12);
//        System.out.println(d.getX());
//        d.setY(15);
//        System.out.println(d.getY());
    }
}
