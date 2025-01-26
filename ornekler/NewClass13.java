package algo1;

import java.util.Scanner;

  //klavyeden girilen stringte kac tane b ve B oldugunu gosteren
public class NewClass13 {
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        System.out.println("bir seyler giriniz");
        String s=k.next();
        int sayacb=0, sayacB=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='b'){
                sayacb=sayacb+1;
            }
            else if(s.charAt(i)=='B'){
               sayacB=sayacB+1;
            }
        }
        System.out.println("b: "+ sayacb+"tane");
        System.out.println("B: "+sayacB+"TANE");
    }
    
}
