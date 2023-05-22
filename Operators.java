package day05concatinationoperatortypecasting;

public class Operators {

    /*
    1) +'-'*'/  islemleri matematikte kullanildigi gibi kullanilir.

    note1= int/int = int olur.( tamsayiyi tamsayiya bolerseniz sonuc int olur)

    note2 = double+ int = double (sonuc double olur) farkli data type kullanirsak matematiksel islemlerde
     java her zaman buyuk data type nde sonuc aliriz.

     2- java da "Logical Operator"lar vardir. AND ve OR islemleri logical operator olarak adlandirilir
     ii == AND (&&) isleminden true alabilmek icin hersey true olmlidir.
     ==And islemi "perfectionist"     tir.
     ==AND isleminde bir tane bile false, sonucu false yapar.



      iii== OR isleminde bir tane true sonucu true yapmaya yeterlidir.
      OR isleminde sonucun false olmasi icin herseyin false olmasi lazim.
      OR islemi polyanna gibi.

      iii) NOT operator(!) true olani false, false olani true yapar.

      !true => false
      !false => true
      !true=> true

      3) Comparison(karsilastirma)
      <,>   <=, >= ,  ==,  !=

      NOT=Karsilastirma operatorlerini kullndinizda kesinlikle BOOLEN alirsiniz( true of false) alirsiniz.

      not= biz AND islemi icin iki taNE && kullaniriz. & da gecerlidir.
      && kullanimi ilk ifade false oldugunda digerlerini kontrol etmez , dolayisyla hizli calisir.
      cunku AND isleminda ilki false ise sonuc her turlu false dir.
      & kullanimi ilk ifade ne olursa olsun digerlerini kontrol eder. False almis ama gidip digerleri yine kontrol eder.
      Bu yuzden hep cift && kullaniriz.

     */


    public static void main(String[] args) {


       boolean first=3<5;

       boolean second = 2+3!= 5;

       boolean third = 2+3*5>=19;

        System.out.println(first+" "+ second+" "+third); // true-false-false

        System.out.println(first && second );// false

        System.out.println(first || second || third); // true




    }
}
