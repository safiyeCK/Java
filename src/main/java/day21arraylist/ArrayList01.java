package day21arraylist;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        // array lere non primitive koyamazsin, sadece adreslerini gorurusun kyarsan
        //Array e primitive data type koyabilirsin

        /*1)Ayni data type na coklu data depolamak icin Array kullaniriz
        2)Arraylerin negatif bir yonu var, icine koyacaginiz eleman sayisini en basta belirtmek zorundasiniz
        3)Arrayler eleman sayisinda esnek degildir. Bu yuzden ArrayList adli bir yeni yapi olusturdu.
        4)Bu yapi eleman sayisinda esnektir.Hic eleman olmazsa 0, 1000 tane koysan da o kadar alir ve ayarlar
        5)ArrayList yerine sadece List de diye bilirsin
        //Java ArrayList leri olusturdan sonra Array Leri iptal etmedi cunku
        //a)Array ler super hizlidir
        //b)Arrayler memory de cok az yer kaplar.
        //c)bu nedenle eleman sayisi belli degismeyen datalari depolamak icin Array ler tercih edilir.
        6)Arrayler primitive data type lari ve referanslari depolar
        Ama ArrayList ler non primitive data type lari da depolar
        Ve ArrayListler Arraylerden daha  cok yer kaplar

         */

        //ArrayList Nasil Olusturulur?
        ArrayList <Integer>ages= new ArrayList<Integer>();

        //ArrayList Konsola Nasil Yazdirilir?
        System.out.println(ages);

        //ArrayList e Nasil Eleman Eklenir?
        ages.add(9);                        //Burada cikan add. methodu obje orijinli o yuzden non statictir.Bu arada
        //yukarida hangi hangi variable kullandiysak ona gore deger atariz
        System.out.println(ages);
        ages.add(12);
        System.out.println(ages);
        ages.add(10);
        ages.add(1,656);   //araya eleman eklemek istedinizde add()(index,sayi) yapiyoruz
        ages.add(3,777);
        ages.add(888);  // sonuncu elemandan sonra eklme yapmak istersek normal yaziyoruz.Zaten en son yazilani sona ekliyor
        System.out.println(ages); // burada ekleme siramiza gore  konsolda da ayni sirda eleman eklenir


        //ArrayList lere eleman eklemek icin add() methodunu kullaniriz
        //Add() methodu elemanlari bizim verdigimiz sirada list e ekler.
        //Buna "insertion orde" denir(inzorsin order)

        //List'e Coklu Eleman nasil eklenir?Veya LIst e baska bir LIst nasil eklenir?
        //Bir List e coklu eleman eklemek icin o elemanlari oncelikle bir list in icine koymalisiniz

        ArrayList<Integer>newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        System.out.println(newAges); //[8, 9, 10]

        ages.addAll(newAges);
        System.out.println(ages); //[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages); //[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //ArrayList te eleman sayisi nasil bulunur?
        int numOfElemement=ages.size();
        System.out.println(numOfElemement); //12

        //ArrayList te specifik bir eleman nasil alinir? get() methodu ile index kullanarak
        int el1= ages.get(1);
        System.out.println(el1); //656

        //ArrayList deki specifik bir elemani nasil degistiririz?(index sirasi ve degistrimek istedigimiz eleman)
        ages.set(6,111);
        System.out.println(ages); // [9, 656, 8, 9, 10, 12, 111, 10, 888, 8, 9, 10]
        ages.set(4,313);
        System.out.println(ages); //[9, 656, 8, 9, 313, 12, 111, 10, 888, 8, 9, 10]

        //Bir LIst te tum elemanlari nasil silebiliriz?
        ages.clear();
        System.out.println(ages);

        //ArrayList te specifik bir elemanin var olup olmadigini nasil anlariz?
        boolean r=ages.contains(313); // var mi yok mu diye arar (false of true)
        System.out.println(r); //burada false gelir cunku daha once sildik  //false

        // Bir ArrayList in bod olup olmadigini nasil anlatiz? bossa True, doluysa false return eder
        boolean r2 =ages.isEmpty();
        System.out.println(r2); //true


        //Ornek-1 Size verilen bir listen bos olup olmadigini kontrol eden kodu yaziniz
        ArrayList<String>names= new ArrayList<>();
        names.add("Gulce");
        names.add("Seda");
        names.add("Benna");
        names.add("Ridvan");
        names.add("Enes");

        //1.wey
        if(names.size()==00){
            System.out.println("List is empty");
        }else{
            System.out.println("LIst has at laest 1 element");
        }

        names.clear();

        //2.wey
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("LIst has at laest 1 element");
        }


        /*
        1)Bir methodu ogrenirken o method ne is yapar?
        2)o method nasil kullanilir?
        3) o method size neyi return eder
         */
           }
}
