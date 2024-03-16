package algo1;

import java.util.Scanner;

//adinizi soyadinizi yasinizi tc kimlik no okul no yazan program
public class Algo1 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String ad = k.nextLine();
        System.out.println("soyadinizi giriniz");
        String soyad = k.nextLine();
        System.out.println("yasinizi giriniz");
        int yas = k.nextInt();
        System.out.println("tc kimlik numaranizi giriniz");
        long tcnu = k.nextLong();
        System.out.println("okul numaranizi giriniz");
        int okulno = k.nextInt();

        System.out.println("adiniz: " + ad);
        System.out.println("soyadiniz: " + soyad);
        System.out.println("yasiniz: " + yas);
        System.out.println("TC kimlik numaraniz: " + tcnu);
        System.out.println("okul numaraniz: " + okulno);
    }

}
