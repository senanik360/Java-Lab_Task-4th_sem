
package javaapplication2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Array_list_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size = "+number.size());
        
        //Adding elements;
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        //printing in easy way;
        System.out.println("Array list contains : "+number);
         
        ////By using for each loop;
        System.out.print("By using for each loop, Array list is : ");
        for(int x : number)
        {
            System.out.print(" "+x);
        }
        System.out.println();
        
        //By using iterator;
        System.out.print("By Using Iterator, Array list is : ");
        Iterator itr =  number.iterator();
         while(itr.hasNext()){
             System.out.print(" "+itr.next());
         }
         System.out.println("");
         
         //Using contain mathod;
         boolean contain = number.contains(30);
         System.out.print("30 is in the list : "+contain);
         System.out.println("");
         
         //Index checkoing;
         int index = number.indexOf(20);
         System.out.println("Index of 20 is : "+index);
         System.out.println(""); 
         
         //Using Set mathod;
         number.set(3,50);
         System.out.println("After setting : "+number);
         System.out.println("");
         
         //Using Get mathod;
         int a = number.get(0);
         System.out.println("Index 0 = "+a);
         
        //Removing elements;
        number.remove(2);
        System.out.println("After Removing Array list contains : "+number);
        
        //By using isEmpty mathod;
        boolean check = number.isEmpty();
        System.out.println("ArrayList empty : "+check);
        
        //Removing all elements;
         number.removeAll(number);
        System.out.println("After Removing All Array list contains : "+number);
        
        
        //By using clear method;
        number.clear();
        System.out.println("After clearing, All Array list contains : "+number);
           
        //By using isEmpty mathod;
        boolean check1 = number.isEmpty();
        System.out.println("ArrayList empty : "+check1);
    }
    
}
