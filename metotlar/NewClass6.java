/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta8;

/**
 *
 * @author asus
 */
public class NewClass6 {
    public static String uzunstringbul(String a, String b){
        if (a.length()>b.length()) {
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        //kendisine parametre olarak gelen iki stringten buyuk olani geri donduren method
        System.out.println("uzun olan string: "+uzunstringbul("kalem","oku"));
    }
}