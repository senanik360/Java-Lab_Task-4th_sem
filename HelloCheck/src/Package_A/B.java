package Package_A;

public class B {

    B(final int a){
        
    }
    static void arr(int arr[]) {
        for (int i : arr) {
            System.out.print("\t" + i);
        }
    }

    public static void main(String[] args) {
        arr(new int[]{1, 2, 3});
        System.out.println();

    }
}

//        for (int i = 0; i < 5; i++) {
//            System.out.print("\t" + i);
//        }
//        ArrayList<Integer> number = new ArrayList<>();
//        System.out.println("Size : " + number.size());
//        //adding elements;
//        number.add(10);
//        number.add(20);
//        number.add(30);
//        number.add(3, 40);
//        Iterator itr = number.iterator();
////        while(itr.hasNext()){
////            System.out.println(""+itr.next());  // One Type of way to print array list
////        }
//        System.out.println(number);        // One Type of way to print array list
////     for(int x : number){
////         System.out.print(" "+x);     // One Type of way to print array list
////     }
//        // removing elements;
//        number.remove(2);
//        System.out.println("After removing ArrayList Contains : " + number);
//        number.removeAll(number);
//        System.out.println("After Removing All ArrayList Contains : " + number);
//        System.out.println("\nSize : " + number.size());
//
//    }
//        int[] number = {-2, -4, 5, 2, 3, 6};
//        Arrays.sort(number);
//        System.out.print("Ascending : ");
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("\t" + number[i]);
//        }
//        System.out.print("\nDescending :");
//        for (int i = 5; i > 0; i--) {
//            System.out.print("\t" + number[i]);
//        }
//        System.out.println("");
//        System.out.print("Ascending : ");
//        String[] name = {"Anik", "Alok", "Anushree"};
//        Arrays.sort(name);
//        for (int i = 0; i < 3; i++) {
//            System.out.print("\t" + name[i]);
//        }
//        System.out.print("\nDescending :");
//        for (int i = 2; i >= 0; i--) {
//            System.out.print("\t" + name[i]);
//        }
//        System.out.println("");
