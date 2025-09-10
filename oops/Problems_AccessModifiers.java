package oops;
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(){
        radius = 30;
        height = 40;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
    public double SurfaceArea(){
        return 2 * Math.PI * radius * (height + radius);
    }
    public double Volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        length = 4;
        breadth = 5;
    }
    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getLength() {
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

public class Problems_AccessModifiers {
    public static void main(String[] args) {
        // PROBLEM 1...
        Cylinder cyl = new Cylinder();
//        cyl.setRadius(10);
//        cyl.setHeight(20);
        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
        System.out.println(cyl.SurfaceArea());
        System.out.println(cyl.Volume());

        //PROBLEM 2...
        Rectangle r = new Rectangle(14, 15);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
    }
}
