package methodOverriding;

public class Bike extends Vehicle {

    @Override
    void run() {
        runningSpeed = 80;
        System.out.println("Bike is running at speed " + runningSpeed);
    }
}
