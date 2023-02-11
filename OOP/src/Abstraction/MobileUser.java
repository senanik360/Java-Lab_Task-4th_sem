package Abstraction;

public abstract class MobileUser {

    abstract void sendMsg();   //abstract method 

    void display() {    //non-abstract method 
        System.out.println("How Are You.?");
    }
}
