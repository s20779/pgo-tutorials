package Cwiczenia6zad2;

public class Address {

    public String createAddress(String kraj){
        return String.format("Country: %s", kraj);
    }

    public String createAddress(String kraj, String miasto){
        return String.format("Country: %s City: %s", kraj, miasto);
    }

    public String createAddress(String kraj, String miasto, String kodPocztowy){
        return String.format("Country: %s, City: %s, Postcode: %s", kraj, miasto, kodPocztowy);
    }

    public String createAddress(String kraj, String miasto, String kodPocztowy, String nazwaUlicy){
        return String.format("Country: %s, City: %s, Postcode: %s, Street name: %s", kraj, miasto, kodPocztowy, nazwaUlicy);
    }

    public String createAddress(String kraj, String miasto, String kodPocztowy, String nazwaUlicy, int nrMieszkania){
        return String.format("Country: %s, City: %s, Postcode: %s, Street name: %s, houseNumber: %d", kraj, miasto, kodPocztowy, nazwaUlicy, nrMieszkania);
    }

}
