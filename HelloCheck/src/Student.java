

public class Student extends SchoolManagement {

    public Student(String name, String id) {
        super(name, id);

    }

    public void Fees(int paidFees) {

        this.paidFees = paidFees;
        this.totalIncome = totalIncome + paidFees;
        this.remainingFees = totalFees - paidFees;

    }

    public void Grade(String grade) {
        this.grade = grade;
    }

    public void DisplayStudentDetails() {
        super.Details();
        System.out.println();
        System.out.println("TOTAL Fees      :" + totalFees);
        System.out.println("PAID FEES       :" + paidFees);
        System.out.println("REMAINING FEES  :" + remainingFees);
        System.out.println("GRADE           :" + grade);
        System.out.println();

    }
}

