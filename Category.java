import java.util.ArrayList;
import java.util.List;

public class Category {
    public String nazwaKategorii;
    private ArrayList<product> lista = new ArrayList<>();

    public Category(){
        this.nazwaKategorii = "glowna Kategoria";
   }
   public Category(String nazwaKategorii){
       this.nazwaKategorii= nazwaKategorii;

   }
   public Category(String nazwaKategorii,ArrayList<product> listaProduktow){
       this.nazwaKategorii= nazwaKategorii;
       this.lista= listaProduktow;


   }

    public void setNazwaKategorii(String nazwaKategorii) {
        this.nazwaKategorii = nazwaKategorii;
    }

    public void addproduct(product product){
        this.lista.add(product);
    }
    public void removeproduct (product product){
        this.lista.remove(product);
    }



}
