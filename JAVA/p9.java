import java.util.*;

abstract class Shape {
    int dimension1, dimension2;

    Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public abstract double area();

    public abstract double perimeter();
}

class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double area() {
        return dimension1 * dimension2;
    }

    @Override
    public double perimeter() {
        return 2 * (dimension1 + dimension2);
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;

    Triangle(int base, int height, double side1, double side2, double side3) {
        super(base, height);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return 0.5 * dimension1 * dimension2;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Circle_ extends Shape {
    private final double radius;

    Circle_(int radius) {
        super(radius, 0);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class p9 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        System.out.println("Rectangle Area: " + r1.area());
        System.out.println("Rectangle Perimeter: " + r1.perimeter());

        Triangle t1 = new Triangle(5, 12, 5, 12, 13);
        System.out.println("Triangle Area: " + t1.area());
        System.out.println("Triangle Perimeter: " + t1.perimeter());

        Circle_ c1 = new Circle_(7);
        System.out.println("Circle Area: " + c1.area());
        System.out.println("Circle Perimeter: " + c1.perimeter());
    }
}