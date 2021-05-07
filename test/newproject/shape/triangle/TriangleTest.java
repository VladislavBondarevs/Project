package newproject.shape.triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle = new Triangle();
        triangle.setSideA(14.0);
        triangle.setSideB(11.0);
        triangle.setSideC(12.0);
        triangle.setP(13.5);
        double result = triangle.getArea();
        Assertions.assertEquals(25, result, 0.4);

    }
}