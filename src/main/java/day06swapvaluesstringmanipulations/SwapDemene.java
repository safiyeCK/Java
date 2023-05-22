package day06swapvaluesstringmanipulations;

public class SwapDemene {

    public static void main(String[] args) {

        int a= 1;

        int b= 2;

        int temp = 0;
        System.out.println(a);
        System.out.println(b);
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

       // 2.yol

        a=a+b;
        a=a-b;
        b=a-b;

        System.out.println(a);
        System.out.println(b);



    }
}
