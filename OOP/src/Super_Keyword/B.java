package Super_Keyword;

public class B extends A {

    int x = 20;

    void display() {
        System.out.println(x);
        System.out.println(super.x);

    }

    @Override
    void msg() {
        super.msg();
        System.out.println("Hello - From B class ! ");
    }

     B() {
         super();
             System.out.println("Hi - From B's constructor.");
}

}
