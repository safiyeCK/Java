package day20statickeywordconstructors;

public class Student {
    /*
    * 1) Static variable veya static methodlar(class nember)tum objectler isin ortak elemandir
    * 2)Static class nember lar uzerinde yapilan tum degisiklikler tum objeleri etkiler
    * 3)Static class nemberlar class a non-static class nemberlar objectlere monte edilir
    * mesela ; bir class tan 100 tane object olusturdugunuzda , non-static olanlar 100 kere olusturulur
    * ana static olanlar objec sayisindan bagimsiz olarak bir kere olusturulur
    * 4) Static class nemberlara ulasmak icin object olusturmaya gerek duymaz.
    * ama non- static class nember lara ulasmak icin object olusturmak sarttir
    * 5) Static variable larin diger adi "Class variable"Dir
    * non -static variable larin diger adi"Instance Variable" veya "Object Variable" dir  * */

    public static String stdName="Tom Hanks"; //  static


    public int age=13; // non static

    public static void staticMedhod(){
        System.out.println("Ben static medhodum"); //static medhod
    }

    public void nonStaticMethod(){
        System.out.println("Ben static olmayan methodum");
    }

}
