/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ornek3 {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3;
        Scanner oku= new Scanner(System.in);
        sayi1= oku.nextInt();
        sayi2= oku.nextInt();
        sayi3=oku.nextInt();
        
        if(sayi1%2==0){
            System.out.println("Sayi1 cifttir");
        }
        else{
            System.out.println("Sayi1 tektir");
        }
        if (sayi2%2==0){
            System.out.println("sayi2 cift");
        }
        else {
            System.out.println("sayi2 tek");
        }
        if(sayi3%2==0){
            System.out.println("sayi3 cift");
            
        }
        else{
            System.out.println("sayi3 tek");
                    
        }
     
        
    }
    
}
