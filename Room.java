package Cwiczenia7zad1;

import java.util.List;

public class Room {

    private double powierzchnia;
    private List<Furniture> listamebli;

    public Room(double powierzchnia, List<Furniture> listamebli) {
        this.powierzchnia = powierzchnia;
        this.listamebli = listamebli;
    }

    public double cenamebli(){
        int x=0;
        double cena=0;

        while (listamebli.size() >= x){
            cena = cena + listamebli.get(x).getPrice(1);
            x++;
        }
        return cena;
    }

}
