
package static_keyword;


public class student {
    String name ;
    int id ;
    static String UN = "AIUB" ;
    student (String n, int i){
        name = n;
        id = i;
    }
    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University Name : "+UN);
    }
}
