package javaapplication18;

import java.util.Random;

//elemanlari random atanan a ve b tam sayi dizilerini toplayip c dizisine atayan ve
//a dizisinin enb elemanini bulan pr.
public class newweek {

    public static void main(String[] args) {

        Random r = new Random();

        int a[][] = new int[3][4];
        int b[][] = new int[3][4];
        int c[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = r.nextInt(10);
                b[i][j] = r.nextInt(10);
                c[i][j] = a[i][j] + b[i][j];

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("a dizisinin" + i + "," + j + " elemani= " + a[i][j]);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("b dizisinin" + i + "," + j + " elemani= " + b[i][j]);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("c dizisinin" + i + "," + j + " elemani= " + c[i][j]);
            }
        }
        int enb = a[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i][j] > enb) {
                    enb = a[i][j];
                }
            }
        }
        System.out.println("a dizisinin en buyuk elemani= " + enb);
    }
}
