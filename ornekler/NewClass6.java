package algo1;

import java.util.Scanner;
//klavyeden girilen 10 sayi arasindan en buyuk 1. ve en buyuk 2. sayiyi bulan pr. 

public class NewClass6 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int enb1, enb2;
        System.out.println("1. sayi girin");
        int x = k.nextInt();
        System.out.println("2. sayiyi giriniz");
        int y = k.nextInt();
        if (x > y) {
            enb1 = x;
            enb2 = y;
        } else {
            enb1 = y;
            enb2 = x;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(i + ". sayiyi giriniz");
            int sayi = k.nextInt();
            if (sayi > enb1) {
                enb2 = enb1;
                enb1 = sayi;
            } else if (sayi < enb1 && sayi > enb2) {
                enb2 = sayi;
            }
        }
        System.out.println("en buyuk 1.sayi: " + enb1);
        System.out.println("en buyuk 2.sayi: " + enb2);
    }
}
