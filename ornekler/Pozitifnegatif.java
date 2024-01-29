package pozitifnegatif;

import java.util.Scanner;
//klavyeden girilen sayinin pozitif mi negatif mi oldugunu ekrana yazan program
public class Pozitifnegatif {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi1 = k.nextInt();
        if (sayi1 >= 0) {
            System.out.println("sayi pozitif");
        } else if (sayi1 < 0) {
            System.out.println("sayi negatif");

        }
    }

}
