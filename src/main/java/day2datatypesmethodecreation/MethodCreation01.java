package day2datatypesmethodecreation;

public class MethodCreation01 {

    public static void main(String[] args) {



       int sonuc =  toplamaYap(3,5) ; //1

        System.out.println(sonuc);

        long carpmaSonucu = multiply (4,5); //2

        System.out.println(carpmaSonucu);

        long tamSonuc = carpTopla (2,3,4);  //3

        System.out.println(tamSonuc);

        int islemSonucu = iklIkiSayiyiCarpSonraBol(3,5,5); //4
        System.out.println(islemSonucu);

        int alan = dikdortgeninAlani(5,7); //5
        System.out.println(alan);

        int cevre= dikdortgeninCevresi(6,9); //6
        System.out.println(cevre);

        int ucgenAlani = usgeninAlani(6,12);

        System.out.println(ucgenAlani);

       double ortalama = sayiOrtalam(13,14,18);

        System.out.println(ortalama);

    }


    // ornek 1= Toplama islemi yapan bir metod olusturunuz
    // ve kullaniniz

    public  static int toplamaYap (int a,int b ){
       return a+b;


    }


    // iki sayiyi carpma islemi yapan bir metod olustur ve kullan

    protected static   long multiply ( int a, int b) {

        return a*b;



    }

    // ornek 3- verilen 3 sayidan 3. sayi ile sonucu toplayan metodu olustur ve kullan

    public static long carpTopla (int a, int b, int c) {
        return a*b+c;
    }

    // ornek 3- verilen 3 sayidan ilk ikisini carpan ve 3. ye bolen bir method olusturun ve yazdirin.

    private static int iklIkiSayiyiCarpSonraBol (int a, int b, int c){
        return a*b/c;
    }
    //Dikdortgenin alanini hesaplayan bir method olustunuz ve yazdiriniz.
public static int dikdortgeninAlani (int a , int b){
        return a*b;
}
    //Dikdortgenin cevresini hesaplayan bir method olustunuz ve yazdiriniz.
public static int dikdortgeninCevresi (int a,int b){

        return a*2+b*2;
}



// Ornek 4- bir cgenin alanini hesaplayan bir method olusturup, yazdiriniz.

public static int usgeninAlani ( int a, int b) {
        return (a*b)/2;

    }


    // Ornek 5; 3 farkli tam sayi degeri giriniz ve ortalamasini aliniz ve yazdiriniz.

    public static int sayiOrtalam (int a, int b, int c){

        return (a+b+c)/3 ;

    }
}