package newproject.shape.square;
import newproject.shape.abstraction.AbstractShape;

public class Square extends AbstractShape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }
}
