package Cwiczenia11zad1;

public class Parallelogram implements Figura {

    private double a,b,h;

    public Parallelogram(double baseSide, double side, double height){
        this.a=baseSide;
        this.b=side;
        this.h=height;
    }


    @Override
    public double getPermiter() {
        return 2*(a+b);
    }

    @Override
    public double getArea() {
        return a*h;
    }

}
