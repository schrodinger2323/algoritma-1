package javaapplication18;

import java.util.Random;
import java.util.Scanner;

//elemanlari rastgele atanan tam sayi dizisindeki cift ve tek sayilarla yeni dizi olusturan ve
//klavyeden girilen deger tek dizide mi diye kontrol eden pr.
public class NewClass7 {

    public static void main(String[] args) {

        Random r = new Random();
        int[] list1 = new int[20];
        int sayac = 0;
        int sayac2 = 0;
        for (int i = 0; i < 20; i++) {
            list1[i] = r.nextInt(100);
            if (list1[i] % 2 == 1) {
                sayac++;
            }
            if (list1[i] % 2 == 0) {
                sayac2++;
            }
            System.out.println(i + ". eleman=" + list1[i]);
        }
        System.out.println("-----------------");
        int[] listtek = new int[sayac];
        int[] listcift = new int[sayac2];
        int j = 0;
        int k = 0;
        for (int i = 0; i < 20; i++) {
            if (list1[i] % 2 == 1) {
                listtek[j] = list1[i];
                j++;
            }
            if (list1[i] % 2 == 0) {
                listcift[k] = list1[i];
                k++;
            }
        }
        Scanner oku = new Scanner(System.in);
        System.out.println("aranacak deger giriniz");
        int sayi = oku.nextInt();
        for (int i = 0; i < sayac2; i++) {
            System.out.println("cift dizi " + i + ". elemani= " + listcift[i]);
        }
        for (int i = 0; i < sayac; i++) {
            if (sayi == listtek[i]) {
                System.out.println("sayi dizinin icinde");
            }
            System.out.println("tek dizi " + i + ". elemani= " + listtek[i]);
        }

    }
}
