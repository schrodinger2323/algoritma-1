package javaapplication13;

import java.util.Scanner;

//klavyeden girilen 3 karakteri alfabetik olarak siralayan pr.
public class alfabetiksiralama {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        char ara;
        System.out.println("uc karakTER GIRINIZ");
        char a = k.next().charAt(0);
        char b = k.next().charAt(0);
        char c = k.next().charAt(0);
        while (a > b || b > c || a > c) {
            if (a > b) {
                ara = a;
                a = b;
                b = ara;
            } else if (a > c) {
                ara = a;
                a = c;
                c = ara;

            } else if (b > c) {
                ara = b;
                b = c;
                c = ara;
            }

        }
        System.out.println("siralanmis karakterler:" + a + " " + b + " " + c);

    }

}
