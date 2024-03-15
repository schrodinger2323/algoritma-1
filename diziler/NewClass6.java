package javaapplication18;

import java.util.Random;

//elemanlari random atanan 10 elemanli tam sayi dizisi ekrana yazan ve
//dizideki 10dan kucuk eleman sayisini ekrana yazan
public class NewClass6 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] list = new int[20];
        int sayac = 0;
        for (int i = 0; i < 20; i++) {
            list[i] = r.nextInt(100);
            if (list[i] < 10) {
                sayac++;
            }
            System.out.println(i + ".eleman" + list[i]);
        }
        System.out.println("dizide 10dan kucuk " + sayac + "kadar eleman vardir");
    }
}
