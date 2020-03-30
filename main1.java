public class main1 {
    public static void main1(String[] args) {
        User u1 = new User("jnowak@gmail.com");
        User u2 = new User("pkowal@gmailc.com");
        User u3 = new User(imie:"Jan", nawizko:"Nowak", email:"robak1@gmailc.com", haslo:"skarpeta" );
        User u4 = new User(imie:"Piotr", nazwisko:"Kowalski", u1.getEmail(), haslo:"koparka" );

        product p1 = new product(nazwa:"platki", cena:5, kod:12345, sztuk:4);
        product p2 = new product(nazwa:"mleko", cena:4, kod:67890, sztuk:2);
        product p3 = new product(nazwa:"sok", cena:2, kod:09876);

        p1.setCena(7);
        p1.setLsztuk(5);
    }

    }
}
