
package InstanceOf_Operator;


public class Test {
    
    public static void main(String[] args) {
        Animal objan = new Animal();
    Person objp = new Person();
    Teacher objt = new Teacher();
        System.out.println(objan instanceof Person);
        
        System.out.println(objp instanceof Animal);
        
        System.out.println(objt instanceof Person);
        
        System.out.println(objt instanceof Animal);
        
        System.out.println(objp instanceof Teacher);
        
        System.out.println(objan instanceof Teacher);
        
        System.out.println(objt instanceof Teacher);
    }
    
}
