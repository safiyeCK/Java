package day08stringmanipulationmemoryusageifstatement;

public class StringManipulation02 {

    public static void main(String[] args) {
        //ornek = Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz.
        //  abc@gmail.com ===> gmail
        //dinamic kod baska yerlerde de kullnilmasi demektir.mesela; hotmail, yahoo gibi yerlerde de bunu kullanabilirsin

        String a= "abc@gmail.com";

        int startingIndex= a.indexOf('@')+1; // +1 aliyoruz almak istegimiz kisim gmail o nedenle +1 aliyoruz.
        // burasi @ in index ini alir. Fakat ben gmail kismini almak istiyorum  o yuzden +1 yaziyporuz
        int eindingIndex = a.indexOf('.');
        // burasi da 9 a kadar olanm index i alir.9 dahil degil
        String companyName =a.substring(startingIndex,eindingIndex);
        System.out.println(" Company name ="+ companyName); // companyName= gmail


        //Ornek 2
        // Verilen iki stringen birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz.

        String h= "ali can";
        String i= "Ali Can";

        boolean result = h.equals(i); // (ikuls methodu) h spetinde bulunan karakterler i sepetendekilere esit mi diye sorar equals() metodu

        System.out.println(result);// false

        // dipnot= Java da memory kullanimi=
        // Stack memory(smail) primitive datalar buarada ve ayni zamanda non PmD larin adrsleri de bulunur.
        //Buna refarence denir
        //Heap memory(huge) non PMD, String, Wrapper ve bizim olusturduklarimiz buarada


        /*
   Javanin urettigi ve kullandigi herseye data denir.
   Javada iki turlu hafiza vardir.
   1) Stack Memory ==> Small gibi
       *) Kucuk Memorydir.
       **) primitive data typelarini ve non- primitive
       data typelarinin referancelarini(adreslerini) barindirir.

   2)Heap Memory ==> Huge Memory gibi
       *) Non- primitive data type'larini barindirir
       Javada Heap Memory'de olusturulan tum datalar icin bir
       referance(adres) bilgisi olusturulur. Referance bilgileri
       stack memory'de yer alir.Herhangi bir sebeple Heap
       Memorydeki datanin referance'silinirse "Garbage Collector "
       Memory'i temizler.
   */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir

         */

      String s ="Tom";
      String t= "Terry";
      String r= new String("Tom");
        System.out.println(s==t); // false verir cunku adresler ve degerler farkli
        System.out.println(s.equals(t)); // false aldik cunku degerler farkli
        System.out.println(s==r); // false cunku refaranslar(adresler ) farkli
        System.out.println(s.equals(r)); // true verir cunku equals methodu sadece degerlere bakar

        //Ornek 3
        // verilen iki stringen birbirinin aynisi olup olmadigini
        //buyuk harf kucuk harf dikkate almadan kontrol eden kodu yaziniz.(equalsIgnoreCase ())

        String j= "ali can";
        String k= "Ali Can";
        boolean result3=j.equalsIgnoreCase(k);   // gormezden gel, gorme onu demek
        System.out.println(result3); // true


        //HOMEWORK
        /*
        1- bir string variable olusturun ve bu stringdeki rakam olmayan karakterlerin sayisini konsola yazdiriniz.
        2= Bir String Variable olusturunuz.Ilk karakter ile son karakter disindaki karakterleri konsala buyuk harflerle yazdiriniz
        3- Bir Strin variable olusturunuz ve bu string deki ilk ve son karakterlerin Ascii degerleini konsola yazdiriniz.
        4- Tek kelimelik bir sehir ismi icin variable olusturun ve sehir isminin ilk harfini buyuk harfle diger harflerini kucuk harfle konsola yazdirin.
        5- Asagidaki kurallara gore oasword u kontrol ediniz.En az 6 karakter olsun.
             * en az 1 buyuk harf
             en az bir kucuk harf
             en az bir tane de rakam olsun


        not=1 canli oturum sirasinda cozulen ornekleri yapmak
        not =2 tum sorulari dinamic kodlarla cozmelisin(yani esnek)
        not= 3 Birbirinizin cozomlerini inceleyerek tavsiyelerde bulunabilir ya da yardim isteyebilir siniz.

         */
        /*Homework
    1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz

     */

    }
}



