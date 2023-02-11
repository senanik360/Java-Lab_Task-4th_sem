package week4.exeercises;

public class Box {

    private double height;
    private double length;
    private double width;
    private double price;
    static double pricePerUnit = 5.0;

    public double getHeight() {
        return height;
    }
      
    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPricePerUnit() {
        double price;

        price = pricePerUnit * (length + width + height);
        return price;
    }
   
}

 /*public static double getTotalPrice() {
        double price ;
        Scanner input = new Scanner(System.in);
        System.out.println("How many time do u wanna creat a box ? :- ");
        int n = input.nextInt();
        price = input.nextDouble();
        for (int i = 0; i < n; i++) {
            double totalPrice = price + totalPrice;
        }
        return totalPrice;
    }*/
