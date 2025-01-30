package algo1;

import java.util.Scanner;

public class NewClass28 {

    public static void main(String[] args) {
        //klavyeden girilen stringler icinde en uzun karaktere sahip olan stringi bulup 
        //ekrana yazan ancak EXIT ifadesi girilmisse pr. durduran
        Scanner k = new Scanner(System.in);
        String s;
        String en_uzun = " ";
        s = k.next();
        en_uzun = s;
        int boy = s.length();
        if (s.equals("EXIT") == true) {
            System.out.println("ilk stringiniz exit, ciktiniz");
            System.exit(1);
        }
        for (;;) {
            s = k.next();
            if (s.equals("EXIT") == true) {
                System.out.println("en uzun string= " + en_uzun);
                //System.exit(1);
                break;
            } else if (boy < s.length()) {
                en_uzun = s;
                boy = s.length();
            }
        }
    }
}
