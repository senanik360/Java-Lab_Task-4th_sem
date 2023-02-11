
package Abstraction;


public class Test {
    public static void main(String[] args) {
     MobileUser mU;   //reference variable 
    
     mU = new Ami();
     mU.sendMsg();
     mU.display();
     
     mU = new Apni();
     mU.sendMsg();
     mU.display();
    }
}
