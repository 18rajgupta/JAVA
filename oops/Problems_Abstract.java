package oops;

abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    public void changeNib(){
        System.out.println("Changing the nib...");
    }
    @Override
    public void write(){
        System.out.println("Writing with Pen...");
    }
    @Override
    public void refill(){
        System.out.println("Refill the Pen...");
    }
}


interface BasicAnimals{
    void eat();
    void sleep();
}
class Monkeys{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}
class Humans extends Monkeys implements BasicAnimals{
    @Override
    public void eat(){
        System.out.println("eating...");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping...");
    }
}


abstract class Telephone{
    abstract void lift();
    abstract void ring();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    @Override
    public void lift(){
        System.out.println("lifting...");
    }
    @Override
    public void ring(){
        System.out.println("ringing...");
    }
    @Override
    public void disconnect(){
        System.out.println("disconnecting...");
    }
    public void call(){
        System.out.println("calling...");
    }
}


interface TVRemote{
    void on();
    void off();
}
interface SmartTVRemote extends TVRemote{
    void volume();
    void call();
}
class TV implements SmartTVRemote{
    public void on(){
        System.out.println("on the tv...");
    }
    public void off(){
        System.out.println("off the tv...");
    }
    public void volume(){
        System.out.println("Volume up or down...");
    }
    public void call(){
        System.out.println("calling...");
    }
}
public class Problems_Abstract {
    public static void main(String[] args) {
//        FountainPen obj = new FountainPen();
//        obj.changeNib();
//        obj.refill();
//        obj.write();

//        Humans obj1 = new Humans();
//        obj1.eat();
//        obj1.bite();
//        obj1.sleep();
//        obj1.jump();

//        Telephone obj2 = new SmartTelephone();
//        obj2.ring();
//        obj2.lift();
//        obj2.disconnect();
//        obj2.call();     //generate an error....

        TV obj3 = new TV();
        obj3.on();
        obj3.off();
        obj3.volume();
        obj3.call();
    }
}
