package day07stringmanipulations;

public class StringManupulations03 {
    public static void main(String[] args) {

        // Bir stringen bas ve sonun da space karakteri varsa siliniz.
        // "      Ali can   " =>> "Ali Can"


        String s = "      Ali Can   ";
        //trim() methodu bir String in  basta ve sondaki space karakterleri siliyor. Ortadaki space varsa silmez.
        s.trim();

        String sTrimmed= s.trim();

        System.out.println(sTrimmed);

        //ornek 2= Asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //Once dolar isaretinden kurtulmliyiz eger valueOf methodu kullanmak istiyorsak
        //replace methoduyla gereksiz karakterlerden kurtulduk
        //sonra valueOf methodu ile String ifadeyi double cevirdik
        // String tv= "$456.99"   String laptop= "$ 875.99"  ==> 456.99+875.99=1332.98

        String tv= "$456.99";
        String laptop= "$ 875.99";
        String tv2 = tv.replace("$","");
        System.out.println(tv2);
        String laptop2 =laptop.replace("$", "");
        System.out.println(laptop2);

        Double totalPrice =Double.valueOf(tv2)+ Double.valueOf(laptop2);
        System.out.println(totalPrice);


        //Ornek 3. Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiniz.
        // "   Ali Can  "==> AC  (Ali Can dan Ac alacagiz)

        String name= "  Ali Can  ";
        char first =name.trim().toUpperCase().charAt(0); // charAt methodu ==> char i return eder
        System.out.println(first); //A
        // trim ile bas ve sondaki space sildim
        // hepsini buyuk yazdirmak icin touppercase yaptik cunku sonucta AC olacak(kullanici buyuk kucuk yanlis girmis olabilir
        //o yuzden buyuk yaptik hepsini
        // charAt [0] ile de ilk karakteri aldik
        char last=name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);

        //1-trim
        // 2-hepsini buyuttuk(toUpperCase)
        // 3-burada Ali Can i kesmem lazim
        // split() methodu ile istedigim karakterlei istedigim yerden kesebilirim.
        // bosluktan kesim Ali ve Can ayri iki karakter oldu.
        // Ali ve Can ayri iki index oldu. Ali 0 , can ise 1. indextir. O yuzden split(" ")[1] seklinde yaziyoruz.
        //charAt(0) methodu ile de index deki ilk karakteri aliyoruz.




        System.out.println(""+first+last);





    }
}
