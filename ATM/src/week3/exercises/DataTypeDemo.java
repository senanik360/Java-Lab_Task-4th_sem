package week3.exercises;

public class DataTypeDemo {

    int byteDefault = 0, byteMax = 127, byteMin = -128;
    static int type;
    static short type1;
    static char type2;
    static long type3;
    static boolean type4;

    public void displayByteDetails() {
        System.out.println("Byte type details : bytedefault = " + byteDefault + ", byteMin = " + byteMin + ", byteMax = " + byteMax + "\n");
    }

    public static void main(String[] args) {
        DataTypeDemo obj = new DataTypeDemo();
        obj.displayByteDetails();

        System.out.println("Default Value of int is : " + type + "\tshort is : " + type1 + "\tchar is : " + type2 + "\tlong is : " + type3 + "\tboolean is : " + type4 + "\n");

    }

}
