package day03methodobjectcreationscanner;

public class MethodCreation01 {


    // soru= verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz.

    // ornel 2= Girilen bir kelimeyi ekrana yazdirina bir metod olusturup


    public static void main(String[] args) {


       double cub = getCube(5);

        System.out.println("cub = " + cub);

      print("Java is easy");
      
      // Method olusturmak icin 2. yol

        // ornek 2= Girilen bir kelimeyi ekrana yazdirina bir metod olusturup(2.yol)
        //main method icindeyken methodda kullnilacak variableleri olusturunuz/
        
        String str= "TechproEu";
                
                // method ismi ve parametreleri yazariz
        
        printConsole(str);// kirmizi kismin ustunde bekleyip creat methoden uzerinde yiklariz. intelij ootomatik bir method 
        //olusturur daha sonra kenidmize gore dizayn ederiz.

        System.out.println(str);
        
        
        // 3. ornek= verilen 2 tam sayiyi carpan ve ekrana yazdiran methodu kullaniniz.
        
        int a= 3;
        
        int b=5;
        
        carpmaYap(a,b);

        System.out.println();

       // 4. ornek= verilen bir tamsayinin karesini consola yazdiran method yazdiriniz

        int sayi= 5;
        karesiniAl (sayi);





        
    }

    private static void karesiniAl(int sayi) {
    }




    private static void carpmaYap(int a, int b) { 
    }

    private static void printConsole(String str) {
    }

    static double getCube( double a ){


        return a*a*a;

    }

    //note: Acces modifair i default yapmak isterseniz acces modifair Yazmayiniz.


    public static void print (String str){

        System.out.println(str);

        // Bir method yeni bir data uretmiyorsa return type void olur.
        // methoden return typr void ise method bady icinde return keyword e yazilmaz


        /* 1) cemberin cevresini hesaplayan methodu olustur ve kullan
        2) Dairenin alanioni hesaplayan methode olusturunuz ve kullaniniz
         */
    }

}
