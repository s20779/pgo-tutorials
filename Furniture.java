package Cwiczenia7zad1;

public class Furniture {

    private final String nazwa;
    private double price;
    private double Vat;

    public Furniture(String nazwa, double price) {
        this.nazwa = nazwa;
        this.price = price;
        this.Vat = 2.0;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice(double vat) {
        vat=Vat;
        double cena = price + vat*(price/100);
        return cena;
    }

}
