package day13loops;

public class Loops02 {
    public static void main(String[] args) {
        // ornek 1= 21 den 180 e kadar hem 2 hem de 3 bolunen tamsayilari ekrana yazdirinzi.
        for (int i = 21;  i<181 ; i++ ){
            if(i%2 == 0  && i%3==0) {
                System.out.println(i+" ");
            }
            }


        //Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile bolunebilen tamsayilari ekrana yazdiriniz
        for( int i=21   ;  i < 181  ; i++  ){
            if(i%2==0 && i%3==0 ){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Ornek 2: Size verilen kucuk harfle yazilmis String in index i cift sayi olan characterlerini buyuk harfe donusturen kodu yaziniz
        //      ankara  ==> AKR
        String s = "ankara";
        for( int i=0   ; i<s.length()  ;    i++  ){
            String ch = s.substring(i,i+1);
            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }
        }
        // s.(dat) nokta ing dat seklinde soyleniyior lengt() aliyoruz
        //dinamik kod olamasi icin// )

        //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java"  ==> "I love J"

        String s1 = "Tramvay";

        for (int i=0 ; i<s1.length() ;                   i++) {

            if(s1.charAt(i)=='a'){
                break;
            }

            System.out.print(s1.charAt(i));
        }

        // daha temiz yol


      //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java"  ==> "I love J"

        String s11 = "Tramvay";

        for (int i = 0; i < s11.length(); i++) {

            char ch = s11.charAt(i);
            if (ch == 'a') {
                break;
            }
            System.out.print(ch);
        }






        //ornek 4: Verilen bir string de son 'a' dan sonraki characterleri ters sirada yazdiriniz.
        // Germany  ==> yn
        String t= "Germany"; // length tum karakter sayisini alir. 7 karakter var.
        // ters yazdiracagimiz icin tersten basladik length() -1 aldik.
        // ama for da baslangic ve bitis onemlidir.

        for (int i = t.length()-1 ; i>=0 ; i--) {

            if(t.charAt(i)=='a'){break;}

            System.out.println(t.charAt(i));


        }



    }
}
