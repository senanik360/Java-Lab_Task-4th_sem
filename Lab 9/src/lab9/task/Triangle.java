
package lab9.task;


public class Triangle extends Shape {

    @Override
    public void drawShape() {
        System.out.println("Drawing Triangle.");
    }

    @Override
    public void area() {
        System.out.println("Area of Triangle is : "+(.5*base*height));    }

}
