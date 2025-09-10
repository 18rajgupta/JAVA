package oops;

interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface HornBicycle {
    void blowHornk3g();

    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle {
    int a = 65;

    void blowHorn() {
        System.out.println("Blowing the horn...");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake...");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying Speedup...");
    }

    public void blowHornk3g() {
        System.out.println("kabhi khushi kabhi gum pee pee pee pee");
    }

    public void blowHornmhn() {
        System.out.println("main hun na poo poo poo poo");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(20);
        cycle.speedUp(10);

        //YOU CAN CREATE PROPERTIES IN INTERFACES...
        System.out.println(cycle.a);
        //YOU CANNOT MODIFY THE PROPERTTIES IN INTERFACES AS THEY ARE FINAL
//        cycle.a = 453;

        cycle.blowHornk3g();
        cycle.blowHornmhn();

        Bicycle b = new AvonCycle();
        System.out.println(b.a);
        b.applyBrake(10);
        b.speedUp(20);

    }
}
