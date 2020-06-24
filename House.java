package Cwiczenia7zad2;

import Cwiczenia7zad1.Room;

import java.util.List;

public class House {

    private List<Room> listapokoi;
    private String adres;
    private static int liczbaPokoi;

    private House(String adres){
        this.adres=adres;
    }

    public static House createHouse(String adres){
        return new House(adres);
    }

    public void addRoom(Room room){
        listapokoi.add(room);
    }

    public void addRoom(List<Room> lroom){
        listapokoi.add((Room) lroom);
    }

    public int getRoomCount(){
        liczbaPokoi=listapokoi.size();
        return liczbaPokoi;
    }

}
