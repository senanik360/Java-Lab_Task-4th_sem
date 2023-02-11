package inheritancedemoproject;

public class Student extends Person {

    public int id;
    public double cg;

    void describeStudent(int id, double cg) {
        describePerson("Anik Sen", 20);
        this.id = id;
        this.cg = cg;
        System.out.println("My id is " + id + ". My CGPA is " + cg);
    }

    @Override
    void displayDailyActivity() {
        super.displayDailyActivity();
        System.out.println("My activities as a Student : I attend classes, do assignment, sit for exams and so on.");
    }
}
