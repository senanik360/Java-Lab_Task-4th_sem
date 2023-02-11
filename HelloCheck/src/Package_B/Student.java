package Package_B;

public class Student {

    private Course[] courses; //Array of course objects
    private String name;
    private int totalCourse;


    Student(String name, int totalCourse) {
        this.name = name;
        this.totalCourse = totalCourse;
        System.out.println("Name : "+name);
        System.out.println("Total Course : "+totalCourse);
        //Complete this constructor
        //initialize courses array with new() and its size is totalCourse
    }

    void addCourse(Course c[], int index) {
        //assign the Course c in the courses array on given index.
    }
}
