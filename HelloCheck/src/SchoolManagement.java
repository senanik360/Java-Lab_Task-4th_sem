
public class SchoolManagement {

    public String name, id, grade;
    public int totalFees = 30000;
    public int paidFees, remainingFees, salary, receivedSalary, SalaryYetToReceive;
    public static int totalIncome, TotalExpense, Profit;

    public SchoolManagement(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public SchoolManagement() {

    }

    public void Details() {
        System.out.println("NAME     :" + name);
        System.out.println("ID       :" + id);

    }

    public void profit() {
        System.out.println();
        System.out.println("    School Profit Information");
        System.out.println("    ==========================");

        System.out.println();
        this.totalIncome = Profit + totalIncome;
        this.TotalExpense = Profit + TotalExpense;
        this.Profit = totalIncome - TotalExpense;
        System.out.println("Total Profit    :" + Profit);
    }

    public static void main(String args[]) {
        System.out.println();
        System.out.println("           STUDENT INFO");
        System.out.println("          ===============");
        System.out.println();
        Student s = new Student("Magibuzz", "20-42130-1");
        s.Fees(20000);
        s.Grade("A+");
        s.DisplayStudentDetails();
        System.out.println();

        System.out.println("           TEACHER INFO");
        System.out.println("          ===============");
        System.out.println();
        Teacher t = new Teacher("Ismailla ", "10-42696-1", 16000);
        t.Paid(12000);
        t.DisplayTeacherDetails();
        SchoolManagement m = new SchoolManagement();
        m.profit();

    }
}

