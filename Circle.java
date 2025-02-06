import java.util.Scanner;

public class Circle {

    private double radius;

    // sets initial radius to 10
    public Circle() {
        this.radius = 10;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // gets the area and makes the mathematical formula for it
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // gets the circumference and makes the mathematical formula for it
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // display method for the circles
    public void Display() {
        System.out.printf("Radius: %.2f \n", this.getRadius());
        System.out.printf("Area: %.2f \n", this.getArea());
        System.out.printf("Circumference: %.2f \n", this.getCircumference());
    }
}
