package Anonymous;

public class Test {

    public static void main(String[] args) {
        Person obj = new Person() {
            @Override
            void display() {
                System.out.println("Hello - From Test Class.!");
            }
        };
        obj.display();
    }
}
