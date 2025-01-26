package algo1;

import java.util.Scanner;
//girilen stringteki kucuk harflerin sayisini ekrana yazdiran prog. quiz sorusu

public class NewClass23 {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String s = k.nextLine();
        int sayac = 0;
        for (int i = 0; i < s.length(); i++) {
            //char t=s.charAt(i);
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sayac++;
            }
        }
        System.out.println(sayac + " tane kucuk harf vardir");
    }

}
