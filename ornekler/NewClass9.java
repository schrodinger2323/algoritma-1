
package algo1;

import java.util.Scanner;

public class NewClass9 {
    public static void main(String[] args) {
        //klavyeden girilen sayilari toplayan 0 girince programdan cikan
        //while dongusu ile
        Scanner k=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int toplam=0;
        while(true){
            int x=k.nextInt();
            if(x==0){
                System.out.println("0 girdiniz programdan ciktiniz");
                System.out.println("toplam= "+toplam); System.exit(1);
                
            }
            toplam=toplam+x;
        }
        
    }
    
}
