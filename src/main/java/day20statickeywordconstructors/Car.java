package day20statickeywordconstructors;

public class Car {


    /*
    Constructor nedir?
    Class'dan object uretmemize yarayan code blocklaridir.

    Class olusturdugumuzda java bize otomatik olarak bir constructor verir.Ama bu constructor gozle gorulmez,
    gozle gorulmeyen otomatik olarak java tarafindan verilen bu constructorlara default constructor denir

    default constructor ===>    " Car(){    } " seklindedir
    Bir class da farkli parametreler kullanarak istediginiz kadar constructer olusturabilirsiniz(senaryoya gore)
    Farkli constructer lar sayesinde bir class dan farkli farkli objeler olusturabilirsiniz.
    1)Constructor nasil olusturlur?
    Acces Modifier+ class ismi +()+{}
    =methodlarda return type olur, constructor de olmaz
    =methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
    =methodlar bir aksiyon yapmak icin olusrulur, cons. ise obje oluturmak icin kullanilir
    =methodlar kucuk harfle baslar, con. ismi class ismi ile ayni oldugu icin her zaman buyuk harf baslar
    =parametreli cons.olusturark ayni c;lass tan farkli ozelliklere sahip objeler olusturabilirzi
     */
    String make="Honda";//make=marka
    String model="Accord";
    int year=2023;
    boolean hybdrid= true;

    //objeler olusturmak icin variableler yazdik
    //obje olusturmak icin constrcater a ihtiyacimiz var
    //constracter olusturmadan obje olusrurulamaz
    // bir class olusturdugunuzda java arka plan da contacter olusturur
    public Car(String  make, String model,int year, boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybdrid=hybrid;

    }

    public Car( String make,String model){
        this.make=make;
        this.model=model;
    }


    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public Car(String aliCan, int i, String istanbul) {
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybdrid=" + hybdrid +
                '}';
    }

}
