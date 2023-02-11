package polymorphismdemoproject;

public class DifferentSequenceOfParameter {

    public DifferentSequenceOfParameter(String name, int id) {
        System.out.println("Name : " + name + "\tID : " + id);
    }

    public DifferentSequenceOfParameter(int id, String name) {
        System.out.println("ID : " + id + "\tName : " + name);
    }

    static void display(String name, int id) {
        System.out.println("Name : " + name + "\tID : " + id);
    }

    static void display(int id, String name) {
        System.out.println("ID : " + id + "\tName : " + name);
    }

}
