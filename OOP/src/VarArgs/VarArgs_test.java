package VarArgs;

public class VarArgs_test {

    public static void main(String[] args) {
        VarArgs obj = new VarArgs();
        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10, 20, 30, 40);
        obj.add(10, 20, 30, 40, 50);
    }

}
