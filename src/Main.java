import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);
        Shape square = new Square(4);
        Shape parallelogram = new Hexagon(5, 8);

        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Parallelogram perimeter: " + parallelogram.getPerimeter());
    }
}