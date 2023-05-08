package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        // java bu satiri okumaz, kendimize ve baskalarina aciklamadir.
        // tek satirlik yorumlar icin bunu kullaniriz.
        /*
        java bu satirlari da okumaz. /* yapinca enter a basinca kapatir java. alta kendisi yapar.
         */
         // Variable( program calisirken bazi kablara ihtiyacimiz var.
        // resert area denir buna.
        // variable memoride bize alan rezerve eder.
        // data degerlerini sakalamak icin olusturulan kaplar

        // Nasil olusturulur variable?
        //1- data type olusturulur + Isim verilir.(veryibel name konuyla ilgili isim ver) +Atama operator(Assigment operator)
        //+ veryibel degeri + ;

        int  age = 13;

        // variable declaration
        // javanin cumlesine statement(siteytmint) denir.
        // dilbilgisindeki nokte ne ise, javadaki ; ayni seydir.
        // Yani statement bittigini gosterir.
        // eger variable declaration yapar asigment yapmazsaniz java kendi
        //default(difolt) degerlerini koyar. Difault sayilar icin sifirdir.
        // java da "=" bu onemli. Java bu operatoru gordugu zaman, once sag tarafi
        //calistirir ve sagdaki degeri alir ve soldaki kutuya( rizort area) koyar.
        // javada esittir demek---- "==" matematikteki "=" java da "=="

        // ornek 1= ogrenci ismi icin variable olusturup deger olarak Ali can atayiniz.

        String ogrenciAdi = "Ali Can" ;

 byte ogrenciYasi = 15 ;



short siteNufusu = 1234;

int ulkeNufusu = 21000000;

long insanVucuduHucre = 1234569702233334l;

long weigtOfSun = 12345678912345l;

float gomlekFiyati = 23.40f;

float ayakkabiFiyati = 34.56f;

double weigtCell = 0.000000000000000000000122;
double weigtAmip = 0.000000000000000000000001;

// ornek 10 = ogrenci notlari icin 2 adet veryebel olusturunuz ve toplamlarini ekrana yazdiriniz.

        byte not1 = 50;

        byte not2 = 33;

        System.out.println(not1+not1);
byte not3 = 30;

byte not4= 50;

        System.out.println(not3+not4);


    }
}
