package methodOverriding;

public class Aeroplan extends Vehicle {

    @Override
    void run() {
        runningSpeed = 800;
        System.out.println("Aeroplan is running at speed " + runningSpeed);
    }
}
