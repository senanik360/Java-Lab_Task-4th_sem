package Method_Overriding;

public class Test {

    public static void main(String[] args) {
        Student objs = new Student();
        Teacher objt = new Teacher();

        objs.name = "Anik";
        objs.age = 20;

        objt.name = "Anisul Islam";
        objt.age = 28;
        objt.qualification = "BSc in CSE";

        objs.displayInformation();
        
        System.out.println("\n");

        objt.displayInformation();
    }
}
