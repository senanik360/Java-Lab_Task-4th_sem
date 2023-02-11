package week5.exercises;

import java.util.Scanner;

public class ArrayDemo {

    public void arrayOfAge() {
        int age[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age " + (i + 1) + " : ");
            age[i] = input.nextInt();
        }
        age[2] = 24;
        System.out.print("The age after edit : ");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i] + "\t");
        }
        System.out.println("");
        /*     
            System.out.print("The age you entered are : ");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i] + "\t");
        }*/
        int sum=0;
        for (int i = 0; i <age.length; i++) {
            sum = sum +age[i];
        }
        System.out.println("Average : "+sum/age.length);
    }

   public void arrayOfName() {
        Scanner input = new Scanner(System.in); 
        System.out.print("How many names you want to enter: ");
        int n = input.nextInt();
        
         String name[] = new String[n];
                 Scanner input2 = new Scanner(System.in); 
        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter Name " + (i+1) + " : ");
            name[i] = input2.nextLine();
        }
      System.out.print("The top 4 names you entered are :");
        for (int i = 0; i < n; i++) {
            System.out.print(name[i]+"\t");
        } 
        System.out.println("");
    }
    public void sumOfValue(){
        int value[] ={5,5,5,5,10,10,20,20};
        int sum = 0;
        for (int i = 0; i <value.length; i++) {
            sum = sum +value[i];
        }
        System.out.println("Sum of all values are: "+sum);
    }
  public void arrayOfCgpay (){
      float cgpa[][] = new float[2][2];
      System.out.println("Enter CGPA of student semesterwise accordingly : ");
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 2; j++) {
              System.out.print("Enter CGPA of student "+(i+1)+": ");
              cgpa[i][j] = input.nextFloat();
          }
      }
      System.out.println("CGPA matrix are given bellow : ");
      for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 2; j++) {
              System.out.print(cgpa[i][j]+"\t");          }
          System.out.println("");
      }
  }

}
