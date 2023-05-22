package day06swapvaluesstringmanipulations;

public class StringgManipulations01 {

    public static void main (String [] args) {

        // String bir non primitive data dir.
        // ayni zamanda bir class dir.

        String s ="Java is easy";

        //Ornek 1= "s" Stringendeki tum characterleri buyuk harf yapiniz.

       String sUpper= s.toUpperCase();
        System.out.println(sUpper); //JAVA IS EASY

        //Ornek 2= "s" Stringendeki tum characterleri KUCUK harf yap

        String sLower = s.toLowerCase();
        System.out.println(sLower); // java is easy

        // Ornek 3="s" stringindeki ilk harfi aliniz.
        char ilkHarf = s.charAt(0);
        System.out.println(ilkHarf); // j

        // Ornek 4= "s" Stringendeki bastan ikinci ve sondan 2. characteri alip, yazdiriniz

        char secondChar= s.charAt(1);
        char secondLastChar =s.charAt(10);
        System.out.println(""+secondChar+secondLastChar); // burada "" bunlari koymazsak char olarak okur
        //Tamsayi gibi alir. Bu nedenle concatination yapiyoruz. "" koyuyoruz.

        // Not= index= java is easy = j=0, a=1, v=2, a=3  =4(burada bosluk var ve boslukta bir indextir)....

        // Ornek 5= "s" Stringindeki character sayisini bulunuz


        int sLenght  = s.length();  // Bu lenght methodu karakterlerin toplam sayisini verir.

        System.out.println(sLenght); // 12 tum karakterleri bosluk da dahil sayar.


        //Ornek-6 "s" Stringendeki ilk dort characteri aliniz.
        // sub demek alt demek. substring= stringden bir parca alir
        //Burada indexler yer alir. 0 dan baslayarak aliriz. Burada ilk index dahil, bitis indexi harictir.
        //o nedenle substring(0,4)bir fazladan yaziyoruz .

       String sub1 =s.substring(0,4); // stirngen belli bir kismini almaya yarar. Sayilari yazarken 1. dahil ikincici dahil degil ama
     //sayiyui alirken dikkat etmeliyiz.
        System.out.println(sub1); // java

        // ornek 7 s stringinde sadece is yazdir.

        String sub2 = s.substring(5,7); //( int begintint, int eindint)

        System.out.println(sub2); // is

        // ornek 8 s String de sadece easy yazdir
        String sub3 = s.substring(8,12);
        System.out.println(sub3); // easy (baslangici normal aliyoruz fakat son kismi bir fazla aliyoruz.)



        // 2.YOL


        //Bir character den baslayip String in sonuna kadar almak isterseniz, ikinci indexi yazmayiniz

        //substring(8,12); yerine substring(8); yazdik boylece baslangic indexinden itibaren sonuna kadar aldik

        String sub4= s.substring(8);
        System.out.println(sub4);//easy

        //Ornek 9: "s" String index "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean isExist= s.contains("money");//false (merak ettiginiz, gormek istediginiz datayi bu yolla kontrol
       //ederiz.isExist= var mi demek. Var mi yok mu diye doruyorsak boolean kullaniriz.
        //"" bu hiclik methodur ve tuk karakterler arasinda var
     // case sensitiz yani buyuk harf kucuk harf dikkat eder
        System.out.println(isExist);

        //Ornek 10: "s" String inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        //Ornek 11:  "s" String 6. characterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
        //soru : "s" String inin  5. index dahil olmak uzere i karakteri ile baslayip baslamadigini kontorl eden kodu yaziniz
        boolean isBegin =s.startsWith("i",5);
        System.out.println(isBegin);//true
        }
}
