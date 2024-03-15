package javaapplication18;

import java.util.Random;

//elemanlari random atanan tam sayi dizisinin en kucuk elemanini ve indisini bulan pr.
public class NewClass9 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] list1 = new int[10];
        list1[0] = r.nextInt(100);
        int enkucuk = list1[0];
        int yer = 0;
        for (int i = 1; i < 10; i++) {
            list1[i] = r.nextInt(100);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". elemani=" + list1[i]);
            if (list1[i] < enkucuk) {
                enkucuk = list1[i];
                yer = i;

            }
        }
        System.out.println("en kucuk eleman "+ list1[yer]+", " + yer + ".indistedir" );
    }
}
