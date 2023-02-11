package lab9.task;

public class Square extends Shape {

    @Override
    public void drawShape() {
        System.out.println("Drawing Square.");
    }

    @Override
    public void area() {
        System.out.println("Area of Square is "+(base*height)/2);    }

}
