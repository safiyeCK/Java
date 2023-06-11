package day23datetimevarargs;

public class Varargs02 {
    public static void main(String[] args) {
        //Example 2: Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
        //           Ali Can ==> AC    Kemal Han ==> KH


        getInitials("Ali Can","Kemal Han");
    }
    public static void getInitials(String... s){
        String inistials="";
        for (String w:s
             ) {inistials=inistials+w.charAt(0)+w.split(" ")[1].charAt(0);
            System.out.println(inistials);
            inistials="";

        }

    }
}
