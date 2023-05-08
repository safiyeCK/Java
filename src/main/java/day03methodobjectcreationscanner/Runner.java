package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {

        //obje nasil olusturulur.
        // java ya hangi class tan obje uretecegini soylemelisin
        //CONSTRACTER  java da objeleri olusturmak icin kullanilan ozel bir methoddur.
        // Class ismi + objet ismi+ Assignment operator + "nev " keyword+ Constructor
          Car            myCar            =                 new            Car();


        System.out.println("myCar.fiyat = " + myCar.fiyat);

        System.out.println("myCar.model = " + myCar.model);

        myCar.harekat();

        myCar.dur();




        Student aliCan = new Student();

        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adres = " + aliCan.adres);
        System.out.println("aliCan.grade = " + aliCan.grade);

        aliCan.study();
        aliCan.feed();





    }
}
