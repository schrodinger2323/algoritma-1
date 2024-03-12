package javaapplication12;

import java.util.Scanner;
//1 ile 100 arasinda verilen iki random sayinin farki

public class JavaApplication12 {

    public static void main(String[] args) {
        int sayi1 = (int) (Math.random() * 100);
        int sayi2 = (int) (Math.random() * 100);
        if (sayi1 < sayi2) {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }
        System.out.println("Soru:" + sayi1 + "-" + sayi2 + "=" + "?");
        Scanner oku = new Scanner(System.in);
        int kullanici_sonuc = oku.nextInt();
        int gercek_sonuc = sayi1 - sayi2;
        if (gercek_sonuc == kullanici_sonuc) {
            System.out.println("Cevabiniz dogru");
        } else {
            System.out.println("Cevabiniz yanlis");
            System.out.println("Dogru sonuc=" + gercek_sonuc);
        }

    }
}
