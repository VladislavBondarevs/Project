package newproject.shape.triangle;
import newproject.shape.abstraction.AbstractShape;

public class Triangle extends AbstractShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double p;


    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getArea(){
        return Math.abs(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}


