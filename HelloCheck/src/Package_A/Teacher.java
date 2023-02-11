
package Package_A;


public class Teacher extends Student {

    private double receivedSalary;
    public static double totalSalary = 20000, totalFees = 30000;

    public Teacher(String name, int id, double receivedSalary) {
        super(name, id, receivedSalary);
        this.receivedSalary = receivedSalary;

    }

    public double getReceivedSalary() {
        return receivedSalary;
    }

    public void setReceivedSalary(double receivedSalary) {
        this.receivedSalary = receivedSalary;
    }

    void TeacherDetails() {
        System.out.println("Teacher's Name : " + getName());
        System.out.println("Teacher's ID : " + getId());
        System.out.println("Mr. " + getName() + " received Salary  " + receivedSalary + " BDT");
        double salaryYetToReceive = totalSalary - receivedSalary;
        System.out.println("Mr. " + getName() + "'s salary yet to receive  " + salaryYetToReceive + " BDT");

    }

}