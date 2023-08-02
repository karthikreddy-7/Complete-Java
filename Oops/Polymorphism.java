package Oops;

/*
 * Implement a Java class hierarchy for a simple shape representation. 
 * The base class should be "Shape," and it should have a method called "calculateArea" that returns 0. 
 * Create two subclasses: "Rectangle" and "Circle." 
 * Implement the "calculateArea" method in each subclass to calculate and 
 * return the area of the respective shape.
 */
public class Polymorphism {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5);
        double a1 = r1.calculateArea();
        System.out.println("the area of the rectangle is:" + a1);
        Circle c1 = new Circle(4);
        double a2 = c1.calculateArea();
        System.out.println("the area of the circle is:" + a2);

    }
}

class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(int r) {
        this.radius = r;
    }

    public double calculateArea() {
        return 3.14 * (radius * radius);
    }
}
