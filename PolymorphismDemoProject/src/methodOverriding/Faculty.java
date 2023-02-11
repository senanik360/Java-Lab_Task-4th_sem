package methodOverriding;

public class Faculty extends Employee {

    String department;
    int roomNo;

    public Faculty(String name, String nationality, String gender, int age, int nid, int salary, String designation, String department, int roomNo) {
        super(name, nationality, gender, age, nid, salary, designation);
        this.department = department;
        this.roomNo = roomNo;

    }

    @Override
    void showdetails() {
        super.showdetails();
        System.out.print("\tDepartment : " + department + "\tRoom No. : " + roomNo);

    }
}
