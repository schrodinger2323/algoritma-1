package algo1;

import java.util.Scanner;

public class NewClass8 {

    public static void main(String[] args) {
        //klavyeden girilen 2 tam sayi arasindaki sayilari kendileri
        //de dahil olmak uzere ekrana yazan program
        Scanner k = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int a = k.nextInt();
        int b = k.nextInt();
        if (a == b) {
            System.out.println("sayilar birbirine esit " + a);
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
    }
}
