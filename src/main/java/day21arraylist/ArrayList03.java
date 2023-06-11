package day21arraylist;

import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Kisa yoldan bir List Nasil olusturulur?
        //List.of methodu ile
        //Bu method bazi methodlari desteklemiyor.Mesela add(),set(),..vs

        List.of('a','c','a','k');
        List.of(1,2,3);

        List <Character> initials=List.of('a','c','a','k');
        System.out.println(initials); //'[a,c,d,k}

       // initials.add('b');
        // initials.set(0,'u');
       // initials.remove(initials.indexOf('a'));

        //List.of() methodu degistirlemez bir list olusturmak icin kullanilir
        //Bu nedenle LIst uzerinde degisiklik yapmaya yonelik methodlari desteklemez
        //ama diger list methodlarini kullanabiliriz.


        //IndexOf(aranan karakter)IndexOf methodu arana karakterin ilk gorunum indexini verir.

        int r1=initials.indexOf('k');
        System.out.println(r1); //3(3.index te)

        int r2=initials.lastIndexOf('a');
        System.out.println(r2); //2 (2. index te)




    }
}
