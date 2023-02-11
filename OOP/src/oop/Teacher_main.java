package oop;

public class Teacher_main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Debasis Kumar", "Male", 34342);
       // teacher1.name = "Debasish Kumar";
        //teacher1.gender = "Male";
        //teacher1.phone = 17555;
      //  teacher1.setInformation("Debasis Kumar","Male",23452);
        teacher1.displayInformation();
        
        System.out.println("\n");
        Teacher teacher2 = new Teacher("Tarek Rahman", "Male", 45632);
        //teacher2.name = "Tarek Rahman";
        //teacher2.gender = "Male";
        //teacher2.phone = 167777;
        //teacher2.setInformation("Tarek Rahman","Male",343422);
        teacher2.displayInformation();

    }

}
