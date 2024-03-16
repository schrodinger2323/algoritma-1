package algo1;

import java.util.Scanner;

//klavyeden girilen stringteki b ve Blerin indislerini gosteren
public class NewClass11 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String s = k.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                System.out.println("b " + i + ". indistedir");
            } else if (s.charAt(i) == 'B') {
                System.out.println("B " + i + ".indistedir");
            }

        }

    }

}
