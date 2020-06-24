package Cwiczenia11zad1;

public class Rectangle implements Figura{

    private double a,b;

    public Rectangle(double sideA, double sideB) {
        this.a = sideA;
        this.b = sideB;
    }

    @Override
    public double getPermiter() {
        return 2*(a+b);
    }

    @Override
    public double getArea() {
        return a*b;
    }

}
