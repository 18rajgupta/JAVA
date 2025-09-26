package oops;

class Shape{
    public int a;
    public int rad;
    public int l;
    public int b;
}

class Rectangle2 extends Shape{
    public Rectangle2(int l, int b){
        this.l = l;
        this.b = b;
    }
    public int area(int l, int b){
        return l*b;
    }
}

class Circle extends Shape{
    public Circle(int r){
        this.rad = r;
    }
    public double area(int r){
        return Math.PI*r*r;
    }
}

public class Shapes{
    public static void main(String[] args){
        Rectangle2 r = new Rectangle2(5, 4);
        Circle c = new Circle(5);
        System.out.println(r.area(r.l, r.b));
        System.out.println(c.area(c.rad));
    }
}



