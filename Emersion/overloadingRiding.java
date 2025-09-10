package Emersion;

class Shape{
    void draw(){
        System.out.println("Can't say shape type");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        super.draw();
        System.out.println("Square Shape");
    }
}
public class overloadingRiding {
    public static void main(String[] args) {
        Shape s = new Square();
        s.draw();
    }
}
