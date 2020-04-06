import java.util.ArrayList;
public class Koszyk {
    private User KontoUzytkownika;
    private ArrayList<product> listaProduktow = new ArrayList<>();


    public Koszyk(){
    }
    public Koszyk(User KontoUzytkownika){
        this.KontoUzytkownika = KontoUzytkownika;
    }

    public Koszyk(User KontoUzytkownika, ArrayList<product> listaProduktow) {
        this.KontoUzytkownika = KontoUzytkownika;
        this.listaProduktow= listaProduktow;
    }
    public void addproduct(product product){
        int lsztuk = product.getLsztuk();
        if(lsztuk>0){
        this.listaProduktow.add(product);
            product.setLsztuk(--lsztuk);
        }

    }
    public void removeproduct (product product){
        int lsztuk = product.getLsztuk();
        System.out.println(product.getCena()+";");
        this.listaProduktow.remove(product);
        product.setLsztuk(++lsztuk);
    }

    public void setKontoUzytkownika(User kontoUzytkownika) {
        KontoUzytkownika = kontoUzytkownika;
    }
    //zaplac
    public double zaplac(){
        double cenakoszyka=0;
        for (int i = 0; i <listaProduktow.size() ; i++) {
            System.out.println(listaProduktow.get(i).getCena());
            cenakoszyka+=listaProduktow.get(i).getCena();

        }
        this.listaProduktow.clear();
        return cenakoszyka;

    }

}
