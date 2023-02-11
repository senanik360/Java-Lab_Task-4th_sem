package inheritancedemoproject;

public class ComputerScienceStudent extends Student {

    @Override
    void describeStudent(int id, double cg) {
        System.out.println("\t*******ComputerScienceStudent class output:*******");
        super.describeStudent(id, cg);
        System.out.println("My department is computer science.");

    }
}
