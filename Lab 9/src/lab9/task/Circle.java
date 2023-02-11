
package lab9.task;


public class Circle extends Shape {
double pi = 3.1416;
    @Override
    public void drawShape() {
        System.out.println("Drawing Circle.");
    }

    @Override
    public void area() {
        System.out.println("Area of Circle is "+(pi*base*base));
    }
    
}
