package week3;

import java.util.Scanner;
//klavyeden girilen stringin polindrom olup olmadigini ekrana yazan program
public class ornek4 {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("string giriniz");
        String s = oku.nextLine();
        int bas = 0;
        int son = s.length() - 1;
        boolean kontrol = true;
        while (bas < son) {
            if (s.charAt(bas) != s.charAt(son)) {
                kontrol = false;
                break;
            }
            bas++;
            son--;
        }
        if (kontrol) {
            System.out.println(s + " polindromdur.");
        } else {
            System.out.println(s + " polindrom degildir");
        }

    }

}
