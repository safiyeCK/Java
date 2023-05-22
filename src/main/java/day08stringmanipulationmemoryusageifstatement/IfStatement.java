package day08stringmanipulationmemoryusageifstatement;

public class IfStatement {
    public static void main(String[] args) {

        // if statement
        // bazi kodlari bazi sartlara gore active edebilmek icin if statement kullanilir.
        // if eger demek ==> if cumlesi

        // if you study hard , you will learn Java (english)

        //if (you study hard){ you will learn Java}( java ca)


        //Ornek1
        //Sayi 'pozitif' ise ekrana yazidirin.

        int num= 13;

        // if in yanindaki parantez cok onemli. Bilgi if e gelir ve eger istenilen varsa cevap verir.
        // yoksa konsol da birsey yazmaz
        if(num>0){
            System.out.println(num+ "==> pozitif");

        }


        //ornek 2
        //sayi -1 ile 10 arasindaysa ekrana "rakam" yazdirin.

        int n = 5;


        if (n >-1 && n<10) {
            System.out.println("rakam");

        }


    }
}
