package algo1;

import java.util.Scanner;

//2 sayinin toplami bolumu carpimi cikartma
public class NewClass {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        double sayi1 = k.nextDouble();
        System.out.println("bir sayi daha giriniz");
        double sayi2 = k.nextDouble();

        System.out.println("birinci sayi= " + sayi1);
        System.out.println("ikinci sayi= " + sayi2);
        System.out.println("toplamlari= " + (sayi1 + sayi2));
        System.out.println("farklari= " + (sayi1 - sayi2));
        System.out.println("carpimlari= " + (sayi1 * sayi2));
        if (sayi2 == 0 && sayi1 == 0) {
            System.out.println("bolum= belirsiz ");
        } else if (sayi2 == 0) {
            System.out.println("bolum= tanimsiz ");
        } else {
            System.out.println("bolum= " + (sayi1 / sayi2));

        }
    }
}
