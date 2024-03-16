package algo1;

import java.util.Scanner;

//klavyeden girilen 10 stringi ekrana yazan
public class NewClass10 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("string giriniz");
        for (int i = 0; i < 10; i++) {
            String s = k.nextLine();
            System.out.println(s);
        }
    }
}
