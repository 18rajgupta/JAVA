package oops;
// HOW TO CREATE A THREAD BY EXTENDING THREAD CLASS....
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 40000){
            System.out.println("My cooking Thread is running");
            System.out.println("I am Happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i < 40000){
            System.out.println("Thread2 for chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}

// HOW TO CREATE A THREAD BY IMPLEMENTING RUNNABLE INTERFACE....
class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a Thread 1 not a Threat 1");
        System.out.println("I am a Thread 1 not a Threat 1");
        System.out.println("I am a Thread 1 not a Threat 1");
        System.out.println("I am a Thread 1 not a Threat 1");
        System.out.println("I am a Thread 1 not a Threat 1");
        System.out.println("I am a Thread 1 not a Threat 1");
        System.out.println("I am a Thread 1 not a Threat 1");
        System.out.println("I am a Thread 1 not a Threat 1");
        System.out.println("I am a Thread 1 not a Threat 1");
        System.out.println("I am a Thread 1 not a Threat 1");
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Thread 2 not a Threat 2");
        System.out.println("I am a Thread 2 not a Threat 2");
    }
}

public class Multithreading {
    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        t1.start();
//        t2.start();

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1, "Raj");
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2, "Gupta");
        gun1.start();
        gun2.start();
        System.out.println(gun1.getName());
        System.out.println(gun2.getName());
    }
}
