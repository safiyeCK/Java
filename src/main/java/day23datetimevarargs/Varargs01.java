package day23datetimevarargs;

public class Varargs01 {
    public static void main(String[] args) {
        //toplama islemi yapan bir method olusturun

        //Asidaki gibi kullanici baska islemlerde yapmak isteyebilir
        //her ihtimal icin bir method olusturmak mumkun degildir
        //java farkili sayidaki parametrelerin hepsini kabul eden bir yapi olusturur
        //bu yapiya varargs denir.
        //varargs arkada array kullanilir

        add(2,3,4);
        System.out.println(add(2,3,4));
        //Bir method parantesinde birden fazla varargs kullanilmza
        //eger bir  method parantezinde birden fazla parametre kullanilacaksa varargs sonda olmali
    }
    public static int add(int... a) {

        int sum = 0;
        for (int w : a
        ) {
            sum += w;

        }
        return sum;
    }




        /*
public static  int add (int a, int b){
        return a+b;
}
public static int add(int a,int b, int c){
        return a+b+c;
}
public static int add(int a,int b,int c,int d){
        return a+b+c+d;

}

         */
}
