package algo1;

import java.util.Scanner;

//klavyeden girilen 10 sayidan pozitif olanlarin ortalamasini hesaplayan pr.
public class onpozitifsayiort {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("10 sayi giriniz");
        int toplam = 0;
        int sayac = 0;
        double ortalama = 0;
        for (int i = 0; i < 5; i++) {
            int sayi = k.nextInt();
            if (sayi > 0) {
                toplam = toplam + sayi;
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println("ortalama hesaplanamadi lutfen baska sayilar giriniz");
        }
        ortalama = toplam / sayac;
        System.out.println("ortalama=" + ortalama);
    }
}
