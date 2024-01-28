/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author asus
 */
public class NewClass1 {
    public static void main(String[] args) {
        double sonuc=0, f=1;
        for(int i=1; i<=5; i++){
            f=f*(i+1);
            sonuc= sonuc+(i/f);
        }
        System.out.println(sonuc);
    }
}
