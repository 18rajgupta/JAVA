package oops;
class Rectangle1{
    public int length;
    public int breadth;

//    Rectangle1(){
//        System.out.println("I am a constructor of a rectangle class");
//    }
    Rectangle1(int l, int b){
        System.out.println("I am a constructor of a rectangle class with param");
        this.length = l;
        this.breadth = b;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int breadth){
        this.breadth = breadth;
    }
    public int area(){
        return this.length * this.breadth;
    }
}
class Cuboid extends Rectangle1{
    public int height;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    Cuboid(int l, int b, int h){
        super(l, b);
        System.out.println("I am a constructor of cuboid class with param");
        this.height = h;
    }
    public int volume(){
        return this.length * this.breadth * this.height;
    }
}

public class Problems_Inheritance {
    public static void main(String[] args) {
       // Rectangle1 r = new Rectangle1(10, 20);
       // System.out.println(r.area());
        Cuboid c = new Cuboid(10, 20, 30);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}
