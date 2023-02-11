package DecimalFormat;

import java.text.DecimalFormat;

public class Demo_1 {

    public static void main(String[] args) {
        DecimalFormat obj = new DecimalFormat("0.00");
        double x = 3.545234;
        System.out.println("X = " + obj.format(x));
    }
}

//            double x = 3.545234;
//            System.out.printf("X = %.2f ",x);           //What as usualy we use in c programming for decimal number formating 

