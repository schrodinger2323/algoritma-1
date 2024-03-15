package javaapplication18;

import java.util.Random;
//elemanlari random atanan iki tam sayi dizisinin elemanlarini toplayip diger diziye atayan ve
//1. dizininin ilk elemanindan, 2.dizinin son elemanindan baslanilip toplanan degerlerle yeni dizi olusturan ve
//bu dizileri ekrana yazan pr.

public class NewClass8 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] list1 = new int[20];
        int[] list2 = new int[20];
        int[] listnw = new int[20];
        int top = 0;
        int[] list3 = new int[20];
        for (int i = 0; i < 20; i++) {
            list1[i] = r.nextInt(100);
            System.out.println("1.dizinin " + i + ". elemani= " + list1[i]);
        }
        for (int i = 0; i < 20; i++) {
            list2[i] = r.nextInt(100);
            System.out.println("2. dizinin " + i + ".elemani= " + list2[i]);
        }
        System.out.println("\n------------------------");
        for (int i = 0; i < 20; i++) {
            top += list1[i] + list2[i];
            listnw[i] = top;
            top = 0;
            System.out.println("yeni dizinin " + i + ". elemani= " + listnw[i]);
        }

        System.out.println("\n------------------------");

        int j = list2.length - 1;
        for (int i = 0; i < 20; i++) {
            list3[i] = list1[i] + list2[j];
            j--;
        }
        System.out.println("1. dizinin ilk elemani ile 2. dizinin son elemaninin toplandigi yeni dizi");
        for (int i = 0; i < 20; i++) {
            System.out.println(i + ". elemani= " + list3[i] + " ");
        }
    }
}
