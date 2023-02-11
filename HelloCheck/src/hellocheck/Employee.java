package hellocheck;

public abstract class Employee {
    abstract void display(); 

    public Employee() {
    }
    public static void main(String[] args) {
        
    }
}

//    public static void main(String[] args) {
//        Employee p = new Employee();
//        p.display();
//    }
//    public double salary;
//    public double tsalary = 0;
//    Scanner input = new Scanner(System.in);
//
//    void display() {
//        System.out.print("Enter total number of Employee : ");
//        int n = input.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter Name  : ");
//            String name = input.next();
//            System.out.print("Enter ID : ");
//            int id = input.nextInt();
//            System.out.print("Enter Fee's : ");
//            salary = input.nextDouble();
//            System.out.println("\t\t\tName : " + name);
//            System.out.println("\t\t\tId : " + id);
//            System.out.println("\t\t\tSalary : " + salary);
//            tsalary += salary;
//        }
//        System.out.println("Salary : " + tsalary);
//    }
