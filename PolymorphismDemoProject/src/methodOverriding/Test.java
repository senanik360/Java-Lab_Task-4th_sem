package methodOverriding;

public class Test {

    public static void main(String[] args) {
            Vehicle obj = new Vehicle();
            obj.run();
            obj = new Bike();
            obj.run();
            obj = new Train();
            obj.run();
            obj = new Aeroplan();
            obj.run();
            
            
//        Bank b = new Bank();
//        b = new SBI();
//        System.out.println("SBI Rate of Interest : "+b.returnInterstRate());
//        b = new ICICI();
//        System.out.println("ICICI Rate of Interest : "+b.returnInterstRate());
//        b = new AXIS();
//        System.out.println("AXIS Rate of Interest : "+b.returnInterstRate());
//        b = new DutchBangla();
//        System.out.println("DutchBangla Rate of Interest : "+b.returnInterstRate());
//        
        
        System.out.println("\t\t -- Person Details --");
        Person p = new Person("PName", "BD", "PMale", 24, 123);
        p.showdetails();
        p = new Employee("EName", "EBD", "EMale", 28, 5678, 30000, "Officer");
        System.out.println("\t\t -- Employee Details --");
        p.showdetails();
        System.out.println("\t\t -- Faculty Details --");
        p = new Faculty("FName", "FBD", "FMale", 50, 1010, 70000, "Professor", "CSE", 420);
        p.showdetails();
        System.out.println("\n\t\t -- Student Details --");
        p = new Student("SName", "SBD", "SMale", 18, 2020, 42138, "SE", "3rd");
        p.showdetails();
        System.out.println("");
    }

}
