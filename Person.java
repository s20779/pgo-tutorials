package Cwiczenia11zad3;

public abstract class Person {

    private String firstName, lastName;
    private int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge(){
        return 2020-birthdayYear;
    }

    @Override
    public String toString() {
        return "lastName " + lastName + " and age " + getAge();
    }
}
