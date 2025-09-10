package oops;
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void run(){
        System.out.println("Runnung from the Enemy");
    }
    public void fire(){
        System.out.println("Firing on the Enemy");
    }
}

public class Problems_oops {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 2;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        Tommy player = new Tommy();
        player.hit();
        player.run();
        player.fire();
    }
}
