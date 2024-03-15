package javaapplication18;

import java.util.Random;

//tek boyutlu 20 elemanli diziye rastgele sayi atayan
//bastan sona yazdiran bi de sondan basa yazdiran pr.
//int sayi= (int) (Math.random()*100);
public class yenihafta {

    public static void main(String[] args) {
        int[] list = new int[20];
        Random r = new Random();

        for (int i = 0; i < list.length; i++) {
            list[i] = r.nextInt(100);
            System.out.println(i + ". eleman" + list[i]);
        }
        System.out.println("\n---------------");
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.println(i + ".eleman" + list[i]);
        }
    }
}
