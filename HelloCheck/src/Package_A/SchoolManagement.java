package Package_A;

import java.util.Scanner;

public class SchoolManagement {

    public static double totalSalary = 20000, totalFees = 30000;

    void SchoolDetails() {
        double totalIncome = totalFees - totalSalary;
        System.out.println("\t-----------------");
        System.out.println("\rTotal Profit of the School  = " + totalIncome + " BDT");
        System.out.println("\t-----------------\n\n");
    }

    public static void main(String[] args) {
        System.out.println("\t\t Student's Info");
        Scanner input = new Scanner(System.in);
        String sname;
        int sid ;
        double fee ;
        for (int i = 1; i <= 2; i++) {
             sname = input.nextLine();
             sid = input.nextInt();
            fee = input.nextDouble();
            

        }
            Student s1 = new Student(sname, sid, fee);
            s1.setGrade("A+");
            s1.StudentDetails();
            System.out.println("");

//        Student s2 = new Student("PontinG", 138, 15000);
//        s2.setGrade("A+");
//        s2.StudentDetails();
//        System.out.println("");

        System.out.println("\t\t Teacher's info");
        Teacher t = new Teacher("Monir", 2020, 15000);
        t.TeacherDetails();
        System.out.println("");

        SchoolManagement m = new SchoolManagement();
        m.SchoolDetails();

    }

}
