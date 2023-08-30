import geometrytwodim.Square;
import geometrytwodim.Triangle;

public class packageimporting {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        Triangle triangle = new Triangle(6.0, 4.0, 5.0, 4.0, 3.0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }

}
