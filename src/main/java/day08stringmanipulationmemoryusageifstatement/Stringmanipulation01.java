package day08stringmanipulationmemoryusageifstatement;

public class Stringmanipulation01 {

    public static void main(String[] args) {
        //Ornek 1: Bir String'in hic character icermedigini (Bos string oldugunu) kontrol eden kodu yaziniz.
        //1. yol length() methodu ile cozum
        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? " + result1);//String bos mu? true

        //2.yol tavsiye edilir
        //Java eger bir konuda method olusturmussa, o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("is Empty ? " + result2);//is Empty ? true

        //Ornek 2:Bir String'in space haric hicbir character icermedigini kontrol eden kodu yaziniz
        String t = "";
        //1. yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println(result3);

        //2. yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);

        //3. yol
        boolean result5=t.isBlank();
        System.out.println(result5);
        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hic birsey icin true verir.


        //Ornek 3=
        // Bir string de a , i, e characterlerinin ilk gorunumlerinin indexlerini toplamini ekrana yazdiriniz.
        // "Java is easy to learn" ==> buradaki a, e. i harflerinin ilk gorunum indez ini  bulacagiz
        //  0123456789...index

        String r="Java is easy to learn";
       int idxA= r.indexOf('a');
        System.out.println(idxA); //1

       int idxI= r.indexOf('i');
        System.out.println(idxI); //5

       int idxE= r.indexOf('e');
       System.out.println( idxE); //8

        //indexOf methodu bir string de aranan karakterin ilk gorunum index ini verir.

        System.out.println(idxA+idxI+idxE);

        //Ornek 4=
        // BIr string deki -java- kelimesinin ilk olarak kacinci index te kullanildigini gosteren kodu yaziniz.
        //"Ah Java vah Java sensiz olmuyor Java"
        String u= "Ah Java vah Java sensiz olmuyor Java";
       int idxJava= u.indexOf("Java");
        System.out.println(idxJava); //3

        //not= indexOf ("Java") kullaniminda siz Java kelimesinin ilk gorunumundeki ilk harfi yani J nin indexsini almis olursunuz.

       int idxjava= u.indexOf("java");
        System.out.println(idxjava); // -1 verdi. bir index hic bir zaman '-' olmaz. Eger IndexOf kullanip -1 alirsaniz
        // aradiginiz karakter yok demektir.

        //Ornek5=
        //Bir string de a , i, e characterlerinin SON gorunumlerinin indexlerini toplamini ekrana yazdiriniz.
        // "Java is easy to learn"
        String g = "Java is easy to learn";
        int idxLastA = g.lastIndexOf('a');
        System.out.println(idxLastA);

        int idxlastI = g.lastIndexOf('i');
        System.out.println(idxlastI);

        int idxlastE =g.lastIndexOf('e');
        System.out.println(idxlastE);

        System.out.println(idxLastA+idxlastI+idxlastE);

        //Not
        //indexOf methodu bir string de aranan karakterin Son gorunum index ini verir.
       // bir lastIndexOf() hic bir zaman '-' olmaz. Eger lastIndexOf kullanip -1 alirsaniz
        // aradiginiz karakter yok demektir.









    }
}
















