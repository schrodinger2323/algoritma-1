package javaapplication18;

import java.util.Scanner;

public class NewClass3 {

    public static void main(String[] args) {
        double toplam = 6;
        Scanner k = new Scanner(System.in);
        System.out.println("bir x degeri giriniz");
        int x = k.nextInt();
        System.out.println("bir n degeri giriniz");
        int n = k.nextInt();
        int s = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                s = s * x;
            }

            toplam += s;
            s = 1;
        }
        System.out.println(toplam);
    }
}
