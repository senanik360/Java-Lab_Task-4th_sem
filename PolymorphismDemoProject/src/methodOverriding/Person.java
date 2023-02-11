package methodOverriding;

public class Person {

    public String name, nationality, gender;
    int age, nid;

    public Person(String name, String nationality, String gender, int age, int nid) {
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.age = age;
        this.nid = nid;
    }

    void showdetails() {
        System.out.print("Name : " + name);
        System.out.print("\tNationality : " + nationality);
        System.out.print("\tGender : " + gender);
        System.out.print("\tNID : " + nid);
        System.out.println("\tAge : " + age);
    }
}
