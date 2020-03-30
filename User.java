public class User {
    private String imie;
    private String nazwisko;
    private String email;
    private String haslo;
    private boolean kontoKlienta;

public User(String imie, String nazwisko, String email, String haslo){
    this.imie= imie;
    this.nazwisko= nazwisko;
    this.email= email;
    this.haslo= haslo;
    this.kontoKlienta= false;
}

public User(String email){
    this.kontoKlienta = true;
    this.email = email;
}
public String getEmail() {
    return email;
}

