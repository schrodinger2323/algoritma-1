package algo1;

import java.util.Scanner;

//klavyeden girilen stringteki a larin kacinci indiste oldugunu yazan
public class NewClass12 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String s = k.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                System.out.print(i + ". "+" indistedir\n");
            }
        }
    }
}
