
public class Student {

    private int id;
    private String name;
    private double cgpa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Nobonita");
        obj.setId(42222);
        obj.setCgpa(4.9);
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        System.out.println(obj.getCgpa());
    }
}
