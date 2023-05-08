package day03methodobjectcreationscanner;

public class Student {
    // bir ogrenci var onun once pasif ozelliklerini olusturduk.
    //Varriabel--- pasif ozellikler
    public String name= "Ali Can";

    public  byte  grade = 8;

    public String adres = "Ankara";


    // method -- aktif ozelllikler

    public  void feed(){
        System.out.println("Saglikli Beslenir");

    }

    public void study (){
        System.out.println("Gunluk Tekrarini Asla Ihmal Etmez");
    }
}
