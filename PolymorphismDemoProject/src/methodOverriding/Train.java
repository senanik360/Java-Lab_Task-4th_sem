package methodOverriding;

public class Train extends Vehicle {

    @Override
    void run() {
        runningSpeed = 60;
        System.out.println("Train is running at speed " + runningSpeed);
    }
}
