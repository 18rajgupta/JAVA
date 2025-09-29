package oops;

class Practice1 extends Thread{
    public void run(){
        while(true){
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Good Morning");
        }
    }
}
class Practice2 extends Thread{
    public void run(){
//        while(true){
////            try{
////                Thread.sleep(200);
////            }
////            catch (Exception e){
////                System.out.println(e);
////            }
//            System.out.println("Welcome");
//        }
    }
}
public class Thread_Problems {
    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        Practice2 p2 = new Practice2();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());

        System.out.println(p1.getState());
//        p1.start();
        p2.start();
        System.out.println(Thread.currentThread().getState());
    }
}
