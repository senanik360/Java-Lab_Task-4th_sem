package Package_B;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {

    public void datetime() {
        Date date = new Date();
        System.out.println(date);
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
//        String currentDate = dateFormat.format(date);
//        System.out.println("\t\t\t\t" + currentDate);
//        LocalTime time = LocalTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
//        String formattedTime = time.format(formatter);
//        System.out.println("\t\t\t\t" + formattedTime);
    }

    public static void main(String[] args) {
//        System.out.println(date);
       Test t = new Test();
       t.datetime();
    }
}

//        int[][] arr = new int[4][];
//        int k = 1, m = 0, n = 1;
//        
//        for (int i = 0; i < 4; i++) {
//            arr[m++] = new int[n++];
//        }
////        arr[0] = new int[1];
////        arr[1] = new int[2];
////        arr[2] = new int[3];
////        arr[3] = new int[4];
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                arr[i][j] = k;
//                k++;
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("\t|" + arr[i][j] + "|");
//            }
//            System.out.println("");
//        }
