package newproject.shape.circle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void getRadius() {
        Circle circle = new Circle();
        circle.setRadius(15);
        double result = circle.getRadius();
        Assertions.assertEquals(15, result, 0.1);
    }
}