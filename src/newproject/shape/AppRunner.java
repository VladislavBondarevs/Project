package newproject.shape;

import newproject.shape.abstraction.Shape;
import newproject.shape.circle.Circle;
import newproject.shape.square.Square;
import newproject.shape.triangle.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Set;


public class AppRunner {
    private static Logger logger = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(8);

        Triangle triangle = new Triangle();
        triangle.setSideA(14.0);
        triangle.setSideB(11.0);
        triangle.setSideC(12.0);
        triangle.setP(13.5);

        Circle circle = new Circle();
        circle.setRadius(15);

        logger.log(Level.INFO, "Area of square is " + square.getArea());
        logger.log(Level.INFO, "Area of circe is " + circle.getArea());
        logger.log(Level.INFO, "Area of triangle is " + triangle.getArea());

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(triangle);
        shapes.add(square);

        Shape minShape = shapes.get(0);
        for (Shape shape : shapes) {
            if (minShape.getArea() > shape.getArea()) {
                minShape = shape;
            }
        }
        String className = minShape.getClass().getSimpleName();
        logger.info("Min shape is " + className + " and has area " + minShape.getArea());

    }

}
