package Cwiczenia11zad2;

public class Cat extends Animal implements Moveable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void start() {
        System.out.println(getType()+" Starts!");
    }

    @Override
    public void stop() {
        System.out.println(getType()+" Stopped!");
    }
}
