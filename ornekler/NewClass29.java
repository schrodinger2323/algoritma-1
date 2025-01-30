package algo1;

import java.util.Scanner;

public class NewClass29 {

    public static void main(String[] args) {
        //klavyeden girilen 10 tam sayi icerisindeki enb tek sayiyi ekrana yazin
        Scanner k = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1 = k.nextInt();
        int enb = ' ';
        int sayi2, sayac = 0;
        if (sayi1 % 2 == 1) {
            enb = sayi1;
            sayac++;
        }
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + ". sayiyi giriniz");
            sayi2 = k.nextInt();
            if (sayi2 % 2 == 1 && sayi2 > enb) {
                enb = sayi2;
                sayac++;

            }

        }
        if (sayac == 0) {
            System.out.println("hic tek sayi girmediniz tekrar deneyin");
        }
        System.out.println("en buyuk tek sayi= " + enb);
    }
}
