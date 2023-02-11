package methodOverriding;

public class Student extends Person {

    int id;
    String major, currentSem;

    public Student(String name, String nationality, String gender, int age, int nid, int id, String major, String currentSem) {
        super(name, nationality, gender, age, nid);
        this.id = id;
        this.major = major;
        this.currentSem = currentSem;

    }

    @Override
    void showdetails() {
        super.showdetails();
        System.out.print("\tID : " + id + "\tMajor : " + major + "\tRunning " + currentSem + " Semester");

    }
}
