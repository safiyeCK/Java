package day05concatinationoperatortypecasting;

public class AsciiValues {
    public static void main(String[] args) {


        /* java da her karakterin bir sayisal degeri vadri bu karakterler ASCII values olarak
        degerlendirilir. Bu taploya ascii table denir.

         */

        // character karakteri ozel bir duruma sahip hem bir karakter hem de bir tam sayi gibi deger alabilir.
        // onun ascii degerini bulmak icin INT data type de bir variable atamasiyla bulduk.

        //herhangi bir karakterin
      char ch= 'A';

        System.out.println(ch); //A

        //bunun ascii degerini nasil goruruz

        int k = 'A';

        System.out.println(k); // 65

        int unlem= '!';

        System.out.println(unlem); //33

        int susluParantez= '}';

        System.out.println(susluParantez); // 125

        char c1 ='a';

        char c2 = '?';

        System.out.println(c1+c2);

        // java da char lari matematiksel islemlerde kullanirsak eger Java o char larin ascii degerlerini kullarak
        // islem yapar



      // HOCANIN NOTU

       /*
        java da her karakterin sayisal bir degeri vardir
        bu degerler ASCII degerler olarak adlandirilir
        Bu degerlerin tamaminin bulundugu tabloya ASCII table denir
         */

      //Herhangi bir character in ASCII degerini bulmak icin o karakteri "int " data typinda bir variable in icine koyunuz
      char chr = 'A';
      System.out.println(chr);//A

      int kk = 'A';
      System.out.println(k);//65

      int unlemm = '!';
      System.out.println(unlem);//160

      char c11= 'a';
      char c22= '?';

      System.out.println(c1+c2);
      //Java da char lari matematiksel islemlerde kullanirsaniz, Java o char larin ACII degerlerini kullanir.
    }

  public static class AsciiValuesHomework {

      public static void main(String[] args) {

          // Character karakteri ozel bir konuma sahiptir.Hem arakter hem de sayidir.
          //Char in data degerini bulmak icin INT data type da bir variable olustururuz.

          char ch = 'A';

          System.out.println(ch); //A

          // Peki ASCII degerini nasil buluruz.

          int k  = 'A';
          System.out.println(k); //65

          int unlem = '!';
          System.out.println(unlem); //33

          int susluParantez = '}';
          System.out.println(susluParantez); //125

          //NOT= Java da char lari matematiksel islemlerde kullanirsak java o char i Ascii degerini kullanarak
          //islem yapar

          char a = 'b';
          char c= 'd';

          System.out.println(a+c); // a ve c nin ascii degerini toplar


      }
  }
}
