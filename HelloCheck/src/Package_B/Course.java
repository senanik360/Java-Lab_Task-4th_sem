package Package_B;

public class Course {

    private String courseName;
    private double gpa;
    private double credit;

    Course(String courseName, double gpa, double credit) {
        this.courseName = courseName;
        this.gpa = gpa;
        this.credit = credit;
        //Completed the constructor
        System.out.println("Course Name : "+courseName);
        System.out.println("CGPA : "+gpa);
        System.out.println("Credit : "+credit);
    }


}
