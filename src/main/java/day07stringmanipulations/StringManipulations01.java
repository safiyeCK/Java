package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String t= "Ali 13 yasindadir!...";
        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        //ifade edilen gurubu degistiriyoruz
        /*
                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]

           2)Tum kucuk harfler==> [a-z] // aradaki - a dan z ye demek. Almasini istedigimiz araligi degistirebiliriz.
           // mesela [a-l] .. gibi

           3)Tum buyuk harfler==> [A-Z]

           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]

           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]

           6)Tum noktalama isaretleri==>\\p{Punct}

           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]i

           8)Kucuk harflerden (haric)farkli tum characterler ==>[^a-z]  // ^ bu sapka= tum kucuk harfler haric hersey demek anlamina gelir.
           9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]
           // 10)  sadece space karakteri ==> \\s
           space karakteri haric demek istiyorsak ==> \\S

           sadece rakamlar ==> \\d
           rakamlar haric==> \\D



         */




        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

        // t stringendeki tum rakamlari ve harfleri "!" e ceviriniz.

        String t2= t.replaceAll("[a-zA-Z0-9]" , "!");

        System.out.println(t2);

        // t Stringendeki tum sesli harfleri ? ne ceviriniz.

        String t3= t.replaceAll("[aeiouAEIOU]","?");//?l? 13 y?s?nd?d?r!...
        System.out.println(t3);


        // t Stringendeki tum karakterleri kucuk harfler haric <> bun cevir
        String t4 = t.replaceAll("[^a-z]","<>");//<>li<><><><>yasindadir<><><><>

        System.out.println(t4);

        //t Stringendeki tum harflerdisindaku karakterlei + ya cevir
        String t5= t.replaceAll("[^a-zA-Z]","+"); //Ali++++yasindadir++++

        System.out.println(t5);

        // spaeceler haricindekini ? cevir
        String t6= t.replaceAll("\\S","?"); // veya "^ " bu isaret ve sapace
        System.out.println(t6);

        //Tum sesli harfler disindakileri & cevir.
        String t7= t.replaceAll("[^aeiouAEIOU]","&");  //A&i&&&&&a&i&&a&i&&&&&
        System.out.println(t7);

    }

}

