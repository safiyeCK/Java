package day21arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        //Bir listen baska bir List ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki List in esit olmasi icin ayni index te ayni elemanlar olmali
        //Bunu index e gore kiyaslamaliyiz

        ArrayList<String> names1=new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2=new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("JIm");

        boolean s =names1.equals(names2);
        System.out.println(s); //False

        //Verilen iki integer LIst te tamamiyla ani elemanlarin olup olmadigini kontrol edin.
        //Bunu yapabilmek icin oncelikle collections dan sort ile kucukten buyuge siralayip sonra esit mi diye bakacagiz
        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.add(8);
        nums1.add(9);
        nums1.add(10);

        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        boolean result=nums1.equals(nums2);
        System.out.println(result); //true

        //ArrayList te bir elmanin ilk gorunumu nasil silinir?
        //ArrayListte bir elemanin ilk gorunumu nasil silinir?
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Istanbul");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Istanbul, Yozgat, Barcelona, Miami, Istanbul, Istanbul, Yozgat]

        //remove() methodu bir elemanin ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);

        //Arraylistte bir eleman index kullanilarak nasil silinir?
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler
        // ve o elemani silip silmedigini ifade eden true yada false return eder

        //remove() methodu index ile kullanilirsa bu indexte silmis oldugu datayi return eder



        //ArrayList olustururken sag tarafa(constructor) Arraylist yazmak zorundasiniz
        //Ama sol tarafa iste ArrayList yazin isterseniz de List yazin ikiside calisir
        //Detaylari collections konusunda gorecegiz

        //Ornek : Bir integer list olusturun ve 12 elemanini siliniz
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //ages.remove(12);
        //System.out.println(ages);


        //1/wey
       // Integer nonPrimitive=12;
      //  ages.remove(nonPrimitive);
      //  System.out.println(ages);

        //2.wey Recommended(okunakli)Hoca bunu kullanmayi tavsiye diyor
        ages.remove((Integer)12); //autobaxing ile (integer) koyduk ve index olarak degil de o sayiyi almasini istiyoruz. Yoksa java bunu primitiv int olarak kabul eder.
        System.out.println(ages);

        //3.wey
        //ages.remove((Integer.valueOf(12)) );
       // System.out.println(ages);

        //4.wey
       // ages.remove(ages.indexOf(12));
       //System.out.println(ages);

        //Bir ArrayList teki bir elemanin tum gorunumlerini nasil sileriz.
        //Bir List deki bir elemanin tum gorunumlerin removeAll ile silebilirz
        //Ama removeAll() list ile kullanilir.(yani once bir List ile silecegimiz elemanlari olusturup sonra removeAll kullaniyoruz ve hepsini siliyor
        List<String>citiesToRemove=new ArrayList<>();
        citiesToRemove.add("Istanbul");
        citiesToRemove.add("Yozgat");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);



    }

}
