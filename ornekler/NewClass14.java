package algo1;

import java.util.Scanner;
//klavyeden girilen stringte b ya da B olup olmadigini gosteren

public class NewClass14 {

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("bir seyler yazin");
        String s = k.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b' || s.charAt(i) == 'B') {

            }
        }
        System.out.println("stringte b veya B vardir");
    }

}
