package javaapplication18;

import java.util.Scanner;

public class NewClass4 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("x degeri giriniz");
        int x = k.nextInt();
        System.out.println("bir n degeri giriniz");
        int n = k.nextInt();
        int toplam = 6, toplam1 = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 3; j++) {
                toplam1 += Math.pow(x, i) + j;

            }
            toplam = toplam + toplam1;

            toplam1 = 0;
        }
        System.out.println(toplam);
    }
}
