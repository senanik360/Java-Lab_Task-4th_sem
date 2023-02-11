package mid_assignment;

import java.util.Scanner;

public class SchoolManagement {

    public static double totalSalary = 0, totalFees = 0;

    void SchoolDetails() {
        double totalIncome = totalFees - totalSalary;
        System.out.println("\t-----------------");
        System.out.println("\rTotal Profit of this School  = " + totalIncome + " BDT");
        System.out.println("\t-----------------\n");
        System.out.println("\t\tThank You.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Students : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Name, ID , Fee and Grade for Student " + i + " : ");
            String name = input.next();
            int id = input.nextInt();
            double fee = input.nextDouble();
            String grade = input.next();
            System.out.println("\t\t Student " + i + " Info");
            Student s1 = new Student(name, id, fee);
            s1.setGrade(grade);
            s1.StudentDetails();
            System.out.println("");
            totalFees += fee;
        }
        
        System.out.print("Enter the Number of Teachers : ");
        int tt = input.nextInt();
        for (int i = 1; i <= tt; i++) {
            System.out.println("Enter Name, ID & Salary for Teacher " + i + " : ");
            String name = input.next();
            int id = input.nextInt();
            double salary = input.nextDouble();
            System.out.println("\t\t Teacher " + i + " info");
            Teacher t = new Teacher(name, id, salary);
            t.TeacherDetails();
            System.out.println("");
            totalSalary += salary;
        }
        SchoolManagement m = new SchoolManagement();
        m.SchoolDetails();
    }
}

