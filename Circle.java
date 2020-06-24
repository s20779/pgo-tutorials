package Cwiczenia11zad1;

public class Circle implements Figura {

    private double promien;

    public Circle(double r){
        this.promien=r;
    }

    @Override
    public double getPermiter() {
        return 2*Math.PI*promien;
    }

    @Override
    public double getArea() {
        return Math.PI*(promien*promien);
    }
}
