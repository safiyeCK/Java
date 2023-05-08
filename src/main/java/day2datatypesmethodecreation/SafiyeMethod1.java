package day2datatypesmethodecreation;

public class SafiyeMethod1 {

    public static void main(String[] args) {




        int sayi;

        sayi= 12;
        System.out.println(sayi);

        sayi= sayi+10;

        System.out.println(sayi);

        sayi= sayi+30;



        System.out.println(sayi);

        String str;

        str="lutfen bir rakan giriniz";

        System.out.println(str);

        str="Lutfen isminizi giriniz";

        System.out.println(str);

        str="Lutfen bilgilerinizi kontrol ediniz";

        System.out.println(str);

        boolean basariliMi;

        basariliMi= true;

        System.out.println(basariliMi);

        basariliMi = false;

        System.out.println(basariliMi);



        int not1, not2, ortNot;

        not1= 90;
        not2=80;
        ortNot= (not1+not2)/2;

        System.out.println(ortNot);

        double not3, not4, not5, ortNot1;

        not3= 67;
        not4= 87;
        not5= 89;
        ortNot1= (not3+not4+not5)/3;

        System.out.println(ortNot1);

        //****(note = 50 )seklinde yazdır, yani etiketiyle birlikte yazdır

        //note = 50

        int note;

        note= 50;

        System.out.println("note = " + note);

        //String bir data olusturalım

        String isim;

        isim= "Ali";

        //***String isim="Ali"; bu sekilde de yazabilirsin.

        //etiketiyle birlikte yazdır (isim = Ali seklınde)

        System.out.println("isim="+ isim);

        //Olusturdugun variable'ı farkli bir variable'a kopyala
        int benimYasim;

        benimYasim= 13;  //benimYasim olarak degıstır

        System.out.println("benimYasim = " + benimYasim);


        String onunIsMi= isim; //onunIsmi

        System.out.println("onunismi = " + onunIsMi);

       double num1= 364.3;
       double num2= 35;
       double num3= 16;
       double num4= 15;
       double toplam= num1+num2+num3+num4;

        System.out.println("toplam="+ toplam);

        double ortalama= toplam/4;

        System.out.println("ortalama="+ ortalama);


        double d1= 124.36;
        double d2= 356.67;

        double  ortlMa = (d1+d2)/2;

        System.out.println(ortlMa);



       //isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
        //soutv -> isim = isimdegeri
        //Isim: ...
       // Soyisim: ...
       // Yas: ...
       // Boy: ...
       // Kilo: ...
        //Not: Sadece bir adet "System.out.println(); kullanınız.


String iSim= "Ali";

String soyIsim= "Kara";

byte yaS= 45;

double boy= 1.70;

double kilo= 67.5;

        System.out.println("Isim="+ iSim +"\nSoyisim="+soyIsim+ "\nYas="+ yaS +"\nBoy="+ boy+"\nKilo="+ kilo );

        String yazdir="Hello World";

        System.out.println(yazdir);










    }



}
