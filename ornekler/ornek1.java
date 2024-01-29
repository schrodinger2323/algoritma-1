
package week3;

import java.util.Scanner;
//klavyeden girilen 10 sayinin toplamini bulan
//for dongusu ile
public class ornek1 {
    public static void main(String[] args) {
        Scanner oku= new Scanner (System.in);
        int sayi, toplam=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+". sayiyi giriniz");
            sayi= oku.nextInt();
         //System.out.println(i+". sayiyi g");
            toplam=toplam+sayi;
        }
        System.out.println("10 tane sayinin toplami="+toplam);
        
            
        }
    }
   

