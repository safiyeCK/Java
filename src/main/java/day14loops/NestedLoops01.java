package day14loops;

public class NestedLoops01 {
    public static void main(String[] args) {
        /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
        */

        for (int i =1   ; i <5    ;    i++) { // ilk haftayi aliyoruz. i=1 ve i<5 bu da hafta bolumu
            System.out.println("Week:"+ i );

            for(int g= 1; g<8; g++){ // burasi gun bolumu
                System.out.println("Day:"+ g);
            }
        }

        // nested yapilar java tarafindan sevilmez fakat interviewda sorubilir
    }
}
