package ornek1;

public class NewClass11 {
    public static void main(String[] args) {
        //10 elemanli tam sayi dizisindeki enb tek sayiyi bulan
        int x[]={15,1,2,3,4,5,6,7,8,9,10,13};
        int enbt=x[0];
        for (int i = 0; i < x.length; i++) {
            if(x[i]%2==1){
                if(x[i]>enbt){
                    enbt=x[i];
                }
            }
        }
        System.out.println(enbt);
    }
}
