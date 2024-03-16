package algo1;

import java.util.Scanner;

//girilen iki sayidan buyugunu ekrana yazdiran
public class NewClass1 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        double sayi1 = k.nextDouble();
        System.out.println("bir sayi daha giriniz");
        double sayi2 = k.nextDouble();
        //double enb;
        if (sayi1 > sayi2) {
            System.out.println("buyuk olan sayi= " + sayi1);
        } else if (sayi1 < sayi2) {
            System.out.println("buyuk olan sayi= " + sayi2);
        } else {
            System.out.println("iki sayi birbirine esittir");
        }
    }

}
