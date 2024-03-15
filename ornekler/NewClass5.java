package javaapplication18;

import java.util.Scanner;

//klavyeden girilen iki sayinin ebobunu bulan pr.
public class NewClass5 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int sayi1 = k.nextInt();
        int sayi2 = k.nextInt();
        int ebob = 1;
        int m = 2;
        while (sayi1 >= m && sayi2 >= m) {
            if (sayi1 % m == 0 && sayi2 % m == 0) {
                ebob = m;
            }
            m++;
        }
        System.out.println("ebob= " + ebob);
    }
}
