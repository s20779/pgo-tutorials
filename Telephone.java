public class Telephone {
    String Marka;
    double rozdzielczoscEkrany;
    int numer;

    public Telephone(String marka, double rozdzielczoscEkrany, int numer ) {
        this.Marka = marka;
        this.rozdzielczoscEkrany = rozdzielczoscEkrany;
        this.numer = numer;
    }
        public String sendMsg(String msg, int numer) {
            return "Wysyłam wiadomość " + msg +  " na numer  " + this.numer;
        }
    }
}

