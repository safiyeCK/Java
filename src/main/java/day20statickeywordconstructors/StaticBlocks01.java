package day20statickeywordconstructors;

public class StaticBlocks01 {
    //Bir variabel olustrudgunuzda deger atamazsaniz o variable initialize(baslatmak) etmediniz demektir
    // mesela double pi;

    double pii; //variable olusturduk ama deger atamadik
     static double pi; // basina static koyduk ki main method da cagirabilelim

    //bazen varibale mizin main methoddan once calsitirlmis olmasini isteriz.
    //nasil yapariz static yazdik ve korli breysle static blok olusturduk ve icinde variablemizi calsitirabiliriz.
    // yani initialize yazptik ve burada calsitirdik , boylece main methoddan once calistirdik
    static  String shape;  //  shape sekil demek

    static {
        pi=3.14;
        System.out.println("Static blok 1");
    }

    // main methoddaan once hazir olmasini istedgimiz bir islem varsa static blogu acar ve mainden once hazir hale getiririz.

    static {
        shape="Circel";
        System.out.println("static blok 2");

    }

    // static bloklar static variableleri initialize etmek icin kullanilir
    //class icinde herseyden oncve calistirilirlar
    //birden fazla static blok varsa yukaridan asagiya dogru calistirilir

    public static void main(String[] args) {

        //Bazen main methoddan calistirlmadan once variablelerin hazir hale getirilmesi gerekir.
        //Bu nedenle static bloklara ihtiyac duyabiliriz.
        //Static variableler static bloklar icinde initialize edilirse o class in icinde herseyden once hazir hale getirlmis olur


        System.out.println(pi);
        System.out.println("main method" );
        System.out.println(shape);

    }
}
