package day05concatinationoperatortypecasting;

public class TypeCasting {

    /* Numeric primitive data typelarinin birbirine donusturlmesine "Type casting" denilir.
    *Numeric(sayisal) Primitive Data Type lar= byte, short, long, float, double
    *tip donusumu bunlar arasinda oluyor
     */
    // not-1: kucuk data typlerine buyuk data typelarina cevirmeyi Java otomatik yapar.
    //Bu isleme "AutoWidening"(otovaydining)otomatik genisletme) denir
    // Not-2 : Buyuk data type larini kucuk data Typelarina cevirmek riskli bir istir.
    //Java bu riskli isi otomatik olarak yapmaz
    //Bu islemi kod yazanlar yapar.
    // Bu isleme "ExpilicitNarrowing"(ekspilistnerroving)(aciktan daraltma).

    //DATA TYPE LARININ BAZILARINI DONUSTUREBILIRSIN

    public static void main(String[] args) {

        // byte data type ne int data typena cevirniz.

        byte age = 13;

        int ageInt = age;

        // byte kutusundaki degeri int kuyusuna koduk. Buna autowidening denir.

        //int data typene short data typena cevirniz.

        int weight = 313;

        short weightShort = (short) weight;// burada java int i short icine koyarken java isyan eder.
        // eger devam edeceksek onuna () icinde short yazdik/

        // ornek = int degerini float degerine cevir.(Autowidening)

        int num = 77000;

        float numF = num; // sonunda .0 olarak gosterdi //77000.0

        // double data typene short data typena ceviriniz

        double number = 12.99;

        short numberShort = (short)number;
        System.out.println( numberShort); //12 ( sondaki kusurati sildi) "ExpilicitNarrowing"

        // ornek

        short numm = 260;

        System.out.println(numm); // 260

        byte numByte= (byte)numm; //4

        // konsolda 4 goruyoruz. byte gore mod aldik -128 + 127 = 256 olur . Short 260 di.
        // yani kucuk kuyuta koyunca datanin bozulma riski vardir.

        // java burada mod islemi yapti.

        // int data type ni float data type na ceviriniz

        int sayi = 12;
        System.out.println(sayi);

        float floatSayi =  sayi;
        System.out.println(floatSayi); // 12

        // Double data type ne short a cevir

        double doubleSayi = 12.99;
        System.out.println(doubleSayi); //12.99

        short shortSayi =(short) doubleSayi; //12

        //example

        short nuM = 260;
        System.out.println(nuM); //260

        byte numBytee =(byte) nuM;
        System.out.println(numBytee); // 4

        // Not= donusum yaptigimiz sayi donuseceginiz data type nin sinirlari disinda ise
        //java mod islemi yapar. Mod islemi sonucu sizin yeni degeriniz olur.




    }


}
