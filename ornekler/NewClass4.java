package algo1;

import java.util.Scanner;

public class NewClass4 {

    public static void main(String[] args) {
        //klavyeden girilen stringi 10 kez yazdiran
        Scanner k = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String s = k.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(s);
        }

    }

}
