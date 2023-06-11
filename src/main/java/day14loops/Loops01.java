package day14loops;

public class Loops01 {
    public static void main(String[] args) {
        // Verilen bir string i ters ceviren kodu yaziniz
        //"Java" ==> "avaJ"

        //1.yol
        String t= "Java";
        String ters= ""; // string deki etkisiz elemandir. normalde hicbirsey yazmazsaniz null olaak atar. o yuzden "" hiclik yaptik
        //ve hiclik kavanozuna (bos kavanoza) attik karakterleri.T sepetindeki karakterlerimizi tersten baslayarak tek tek ters seoetine atiyoruz

        for (int i = t.length()-1 ; i >=0 ; i--) { //i>=0 bitis yerini aliyoruz yoksa devam eder.
           ters =ters + t.substring(i,i+1); //buarada a yi alir hiclikle toplar ve ters kavanozuna koyar.i yi alir i+1 i almaz.
            //subsitringde baslangic i , sonindex i+1 olur.
        }
        System.out.println(ters);


        //2.yol
        String u= "Java";
        String ters2="";
        for (int i =u.length()-1; i >=0 ; i--) {
            ters2=ters2+u.charAt(i); // char olmasi gerekirken string diyor, atama yaptirmiyor.

        }

        System.out.println(ters2);

        // substring ve char farki. sub kullanirsan sadece string verir. charAt ise char verir ama char da olsa
        //ters2 de char ile concatination yaptik ama char da olsa string gorunce string gibi devam ettirdi


        //ornek=Size verilen bir stringen "Palindrome" olup olmadigini kontrol eden kodu yaziniz.
        // nalan, ey edip adanada pide ye, 404

        //Logic=String e ters cevir sonra dzu hali ile ters halini karsilastir

        String duz= "ey edip adanada pide ye";
        String ters3="";

        for (int i = duz.length()-1; i >=0 ; i--) {
            ters3= ters3+ duz.charAt(i); // ters+ mantigi 2 kavanoz olusturduk. ters sepetimize karakterleri sirayla koyuyoruz
            // ve ters kavonozumuzla da topluyoruz
           // 2.yol ters3=ters3+duz.substring(i,i+1);

        }
        if(duz.equals(ters3)){
            System.out.println("Palindrome dur");
        }else{
            System.out.println("Palindrome degildir");
        }
       // ternery yontemi= String result = duz.equals(ters) ? "Palindromdur" : "Palindrom değildir";
        System.out.println(ters3);











    }








}
