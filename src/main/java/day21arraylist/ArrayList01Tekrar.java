package day21arraylist;

import java.util.ArrayList;

public class ArrayList01Tekrar {
    public static void main(String[] args) {
        //Elemanlari A, C, F olan bir String Array olusturup ekrana ayziniz
        ArrayList<String>harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        System.out.println(harfler); //[A, C, E, F]

        //Indexsiz add methodunu kullanarak B yi ekleyiniz.Indexli L yi 1. indexe ekleyiniz
        harfler.add("B");
        harfler.add(1,"L");
        System.out.println(harfler); //[A, L, C, E, F, B]

        //Set() methodunu kullanarak A yi D yapiniz
        harfler.set(0,"D");
        System.out.println(harfler); //[D, L, C, E, F, B]


    }
}
