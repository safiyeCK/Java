package day15loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
/*            3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30*/

        Scanner input= new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int num = input.nextInt();

        int i=1; //baslangic noktasi
        while (i<11) // calisma sarti 1 ile 10 arasi 11 aliyoruz
            {
                System.out.println(num+" x "+i+"="+(num*i)); // carpi hepsinde sabit ve +i ile de birere birer arttiriyoruz
                i++;
        }



        //example 2= verilen bir String de her harfin sonrasina yildiz sembolu ekleyiniz.
        // Java ==> j*a*v*a

        System.out.println("Bir kelime giriniz");
        String word= input.next();
        String newWord=""; // eger yeni bir kelime ya da sayi olusturuyorsak bir alan rezerv etmeliyiz.

        int a=0;//Baslangic indexi o nedenle sifir
        while (a<word.length()){
           newWord =newWord+word.charAt(a)+"*";

            a++;
        }
        System.out.println(newWord);


        /*indeOf("k")==>0
LastIndeOf("k")==>6 ilk gorunumun index i ile son gorunumun index i farkli ise
                    o karakterin tekrarli oldugunu gosterir
 indeOf("r")==>0
LastIndeOf("r")==>6 ilk gorunumun index i ile son gorunumun index i ayni ise
                     o karakterin tekrarsiz oldugunu gosterir */


        //Example 3: Bir string deki tekrarsiz karakterleri console a yazdiriniz
        // kertenkelle  ==> rtn
        // indexOf("k") ==> 0  farkli, tekrarli
        // lastIndexOf("k") ==> 6

        // indexOf("r") ==> 2  ayni ise tekrarsiz
        // lastIndexOf("r") ==> 2

        String s = "kertenkelle";
        String sonuc = "";
        int b = 0;
        while (b < s.length()) {
            char ch = s.charAt(b);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                sonuc = sonuc + ch;
            }
            b++;
        }
        System.out.println(sonuc);
    }
}
