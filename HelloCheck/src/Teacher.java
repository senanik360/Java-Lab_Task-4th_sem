
public class Teacher extends SchoolManagement {

    public Teacher(String name, String id, int salary) {
        super(name, id);
        this.salary = salary;

    }

    public void Paid(int receivedSalary) {

        this.receivedSalary = receivedSalary;
        this.TotalExpense = TotalExpense + receivedSalary;
        this.SalaryYetToReceive = salary - receivedSalary;
    }

    public void DisplayTeacherDetails() {
        super.Details();
        System.out.println();
        System.out.println("Salary                   :" + salary);
        System.out.println("Received Salary          :" + receivedSalary);
        System.out.println("Salary Yet To Receive    :" + SalaryYetToReceive);
        System.out.println();

    }
}
