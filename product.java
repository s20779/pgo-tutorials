public class product {
    public String nazwa;
    public double cena;
    public int kod;
    public int lsztuk;

    public product(String nazwa, double cena, int kod, int lsztuk) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kod = kod;
        this.lsztuk = lsztuk;
    }
    public product(String nazwa, double cena, int kod, int kod) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kod = kod;
        this.lsztuk = 0;
    }
    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        return cena;
    }
    public int getLsztuk() {
        return lsztuk;
    }
    public void setLsztuk(int lsztuk) {
        this.lsztuk = lsztuk;
        if (lsztuk >= 0) ;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kod = kod;
        this.lsztuk = 0;
    }
    public String getNazwa() {
        return nazwa;
    }
    public int getKod() {
        return kod;
    }
    }
}
