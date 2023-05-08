package day3homework;

public class MethodCreationTekrar2 {
    public static void main(String[] args) {


        // 1.

       int a= 4;
       int b=5;

       carpmaYap(a,b);


        System.out.println();

        // 2

        int sonuc = carpmaYap1(5,7);


        System.out.println(sonuc);

        // 3.

        int sayi = cub(7);
        cub (sayi);

        System.out.println(sayi);

        // 4.

        int alan= dikdortgenAlan(4,7);
        int cevre= dikdoergeninCevresi(4,7);

        System.out.println("alan = " + alan);
        System.out.println("cevre = " + cevre);
    }

    private static void carpamYap1(int sonuc) {
    }

    // 1. ornek= verilen 2 tam sayiyi carpan ve ekrana yazdiran methodu kullaniniz.
    public static void carpmaYap(int a, int b){}

    // 2. ornek= verilen 2 tam sayiyi carpan ve sonucu ekrana yazdiran methodu kullaniniz.
    public static int carpmaYap1 ( int x, int y) {
        return x*y;
    }

    // 3. ornek= verilen bir tamsayinin karesini consola yazdiran method yazdiriniz
    public static int cub (int a){
        return a*a;
    }


    // 4. ornek bir dikdortgenin cevresini ve alanini hesaplayan bir method olusturun
    // ve yazdirin

    public static int dikdortgenAlan(int a, int b){
        return a*b;
    }
    public static int dikdoergeninCevresi(int a, int b){
        return a*2+b*2;
    }

}
// default secersek acces modifair e gerek yok.
