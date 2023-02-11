
public class C_1 {

    static int id = 43819; //class variable
    String name = "Nobonita";  // instance variable

    int display() {
        int age = 20;  // local variable 
        return age;
    }

    void show() {
        System.out.println("Hello. I am " + name );
        System.out.println("ID : "+id);
        System.out.println("Age : "+display());
    }
    
}


/* There are three types of variable in Java.
- instance variable [ inside the class but outside any mathdo ]
- local variable [ inside any mathod ]
- class variable [ same as instance varibale but have to use static keyword ]
/*
#include<iostream>
using namespace std;
int main(){
for(int n=1; n<=20; n=n+1){
         cout<<n<<"\t"<<endl;
       } 
}

if (a==1){
System.out.print("One");
}
else if (a==2){
System.out.print("Two");
}
else {
System.out.print("INvalid");

}

 */
