package methodOverriding;

public class Vehicle {

    int runningSpeed;

    void run() {
        runningSpeed = 0;
        System.out.println("Vehicle is running at speed " + runningSpeed);
    }
}
