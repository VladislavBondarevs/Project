package newproject.shape.square;

import org.junit.jupiter.api.Assertions;

class SquareTest {

        @org.junit.jupiter.api.Test
        void testGetArea() {
            Square square = new Square();
            square.setSide(8);
            double result = square.getArea();
            Assertions.assertEquals(64, result, 0.1);
      }
    }
