package mid_assignment;

public class Student {

    private double payment;
    private String name;
    private int id;
    private String grade;

    public Student(String name, int id, double payment) {
        this.payment = payment;
        this.name = name;
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void StudentDetails() {
        double installment;
        System.out.println("Student's Name : " + name);
        System.out.println("Student's ID : " + id);
        System.out.println("Mr. " + name + "'s Grade : " + getGrade());

        if (payment == 30000) {
            System.out.println("Full Payment Confirmed.");
        } else {
            installment = 30000 - payment;
            System.out.println("Mr. " + name + " paid his 1st installment " + payment + " BDT" + "\nHis remaining payment : " + installment + " BDT");
        }
    }
}
