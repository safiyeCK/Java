package day3homework;

import static day3homework.MethodCreationTekrar1.printConsole;

public class MethodDenemeler {


    public static void main(String[] args) {

        // method olusturmada ikinci yol
        // once method kismi = parameteler
        // mesela asgida once String str = "Hayat guzeldir"
        // yazdim sonra printConsole(str); yaptik ve boylece bir methor oldu
        // 1. ornek

        String str = "Hayat Guzeldir";
        printConsole(str);

        // 2. ornek
        double alan = 3.14* 5;

        printConsole1(alan);

        System.out.println(alan);

        // 3. ornek

        int sayi = 5*5;

        sayininCarpimi(sayi);

        System.out.println(sayi);

        // 4. ornek
        double daireAlan= 3.14*6;

        daireninAlani(daireAlan);
        System.out.println( daireAlan);

        // ornek 5 1. yol

        int sonuc= ikiSayininKaresi(7);

        System.out.println(sonuc);


    }

    private static double daireninAlani(double daireAlan) {
        return 3.14*6;
    }

    private static void sayininCarpimi(int sayi) {
    }

    private static void printConsole1(double alan) {
    }

    public static int ikiSayininKaresi( int a ) {
        return a*a;
    }

}
