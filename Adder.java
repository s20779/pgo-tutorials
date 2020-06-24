package Cwiczenia6zad1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Adder {

    private List<Integer> list = new ArrayList<Integer>();
    private List<BigDecimal> list1 = new ArrayList<BigDecimal>();

    public void add(int a, int b){
        list.add(a);
        list.add(b);
    }

    public void add(List<BigDecimal> lista){
        list1.add((BigDecimal) lista);
    }

}
