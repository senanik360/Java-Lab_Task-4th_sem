package methodOverriding;

public class Employee extends Person {

    int salary;
    String designation;

    public Employee(String name, String nationality, String gender, int age, int nid, int salary, String designation) {
        super(name, nationality, gender, age, nid);
        this.salary = salary;
        this.designation = designation;

    }

    @Override
    void showdetails() {
        super.showdetails();
        System.out.println("\tSalary : " + salary + "\tDesignation : " + designation);
    }
}
