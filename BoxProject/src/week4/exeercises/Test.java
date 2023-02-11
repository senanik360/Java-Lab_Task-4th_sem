
package week4.exeercises;


public class Test {
    public static void main(String[] args) {
      Box obj = new Box();
        obj.setHeight(2.0);
        obj.setLength(5.5);
        obj.setWidth(2.5);
        
        System.out.println("Length is : "+obj.getLength());
        System.out.println("Width is : "+obj.getWidth());
        System.out.println("Height is : "+obj.getHeight());
        System.out.println("Price of this Box is : "+ obj.getPricePerUnit()); 
       // ScannerDemonstration obj1 = new ScannerDemonstration();
       // obj1.readInteger();
        //obj1.describeYourself();
        //StringDemo obj2 = new StringDemo();
        //obj2.stringDemo();
    }
}
