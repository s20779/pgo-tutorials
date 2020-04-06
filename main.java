import java.awt.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
       User u1 = new User("akow@gmail.com");
       User u2 = new User("kot@gmail.com");
       User u3 = new User("Anna" , "Kowalska" , "krysiaw@gmail.com", "kurczak" );
       User u4 = new User("Konrad","Karolak", u1.getEmail(),"krowa");
       //produt
       product p1 = new product("mleko",5,75648,4);
       product p2 = new product("woda",3,56748,2);
       product p3 = new product("kiwi",2,45678);

       p1.setCena(7);
       p1.setLsztuk(5);
       //lista produktów
        ArrayList<product> list = new ArrayList<product>();
        //category
        Category c1 = new Category();
        c1.addproduct(p3);
        Category c2 = new Category("nabiał");
        c2.addproduct(p1);
        Category c3 = new Category("napoje",list);
        c3.addproduct(p2);
        //koszyk
        Koszyk k1 = new Koszyk();
        k1.addproduct(p1);
        Koszyk k2 = new Koszyk(u1);
        k2.addproduct(p3);
        k2.addproduct(p1);

        Koszyk k3 = new Koszyk(u2,list);
        k3.addproduct(p2);
        k3.addproduct(p1);
        k3.removeproduct(p2);


        System.out.println( k3.zaplac());
        System.out.println(p1.getLsztuk());
        System.out.println(p2.getLsztuk());






    }
}

