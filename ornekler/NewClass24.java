package algo1;

import java.util.Scanner;
//klavyeden girilen 10 string içerisinden a ile başlayıp z ile biten string kontrolü yapan pr.

public class NewClass24 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("10 string giriniz");
        String stoplam = " ";

        for (int i = 0; i < 10; i++) {
            String s = k.nextLine();

            if (s.charAt(0) == 'a' && s.charAt(s.length() - 1) == 'z') {
                stoplam = stoplam + s;
            }
        }

        if (stoplam == "") {
            System.out.println("a ile baslayip z ile biten string girilmemistir");
        } else {
            System.out.println("ilk karakteri a ve son karakteri z olan stringler= " + stoplam + " ");
        }
    }
}
