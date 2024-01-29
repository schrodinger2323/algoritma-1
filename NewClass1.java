
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */

//klavyeden girilen sayilardan pozitif olanlarin ortalamasini hesaplayan program
public class NewClass1 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayac=0 ,toplam=0;
        double ortalama=0;
        for(int i=0; i<10; i++){
            int x=k.nextInt();
            if(x>0){
                toplam= toplam+x;
                sayac++;
            }
        }
        if(sayac==0){
            System.out.println("ortalama hesaplanamadi lutfen baska sayilar giriniz");
        }
        ortalama=toplam/sayac;
        System.out.println("ortalama="+ortalama);
    }
}

