package javaapplication13;

import java.util.Scanner;

//klavyeden girilen stringi ters cevirip geri donduren rekursif fonk
public class kendidenemelerim {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("bir seyler yazin");
        String metin = k.nextLine();
        String cevrilen = cevir(metin);
        System.out.println("Cevrilen Yazi: " + cevrilen);
    }

    public static String cevir(String metin) {
        if (metin.isEmpty()) {
            return metin;
        }
        return cevir(metin.substring(1)) + metin.charAt(0);
    }

}
