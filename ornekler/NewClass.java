package javaapplication12;

import java.util.Random;
import java.util.Scanner;

//TAS KAGIT MAKAS OYUNU
public class NewClass {

    public static void main(String[] args) {
        int pc, kisi;
        Random r = new Random();
        pc = r.nextInt(3) + 1;
        //System.out.println("pc= "+pc);
        System.out.println("1 tas");
        System.out.println("2 kagit");
        System.out.println("3 makas");
        System.out.println("lutfen seciminizi belirtiniz");

        Scanner oku = new Scanner(System.in);
        kisi = oku.nextInt();
        if (kisi != 1 && kisi != 2 && kisi != 3) {
            System.out.println("yanlis bir secim yaptiniz");
        } else {
            if (pc == kisi) {
                System.out.println("berabere");
            } else if (pc == 1 && kisi == 2) {
                System.out.println("kisi kazandi");
            } else if (pc == 1 && kisi == 3) {
                System.out.println("pc kazandi");
            } else if (pc == 2 && kisi == 1) {
                System.out.println("pc kazandi");
            } else if (pc == 2 && kisi == 3) {
                System.out.println("kisi kazandi");
            } else if (pc == 3 && kisi == 1) {
                System.out.println("kisi kazandi");
            } else if (pc == 3 && kisi == 2) {
                System.out.println("pc kazandi");
            }
        }

    }

}
