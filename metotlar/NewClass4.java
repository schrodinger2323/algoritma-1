
package hafta8;


//1 den kendisine parametre olarak gelen sayiya kadar toplayan metod
public class NewClass4 {
    public static int toplam(int n){
        int sonuc=0;
        for (int i = 1; i <=n; i++) {
            sonuc+=i;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        
        System.out.println(toplam(10));
    }
}
