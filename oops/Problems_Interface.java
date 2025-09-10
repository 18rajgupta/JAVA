package oops;
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void sleep();
    void eat();
}
class Human extends Monkey implements BasicAnimal{
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void eat(){
        System.out.println("Eating...");
    }

}

public class Problems_Interface {
    public static void main(String[] args) {
        BasicAnimal b = new Human();   // POLYMORPHISM
        Monkey m = new Human();     // POLYMORPHISM
    }
}
