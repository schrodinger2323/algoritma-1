package daireninalani;

import java.util.Scanner;
//klavyeden girilen yaricap degerine gore dairenin alanini hesaplayan pr.
public class Daireninalani {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double alan;
        System.out.println("bir yaricap degeri giriniz");
        int sayi = k.nextInt();
        if (sayi > 0) {
            alan = sayi * sayi * 3.14;
            System.out.println("Alan=" + alan);

        }

    }

}
