package ornek1;

public class NewClass12 {

    public static void main(String[] args) {
        //kpog tek boyutlu sayisal dizi icerisindeki negatif sayilarin toplamini geri donduren rekursif methot
        //kpog(kenidisine parametre olarak gelen)
        int x[] = {-1, -2, 3, -4};
        int y = negtop(x, 0);
        System.out.println(y);
    }

    public static int negtop(int a[], int ind) {
        if (ind == a.length) {
            return 0;
        } else if (a[ind] < 0) {
            return a[ind] + negtop(a, ind + 1);
        } else {
            return negtop(a, ind + 1);
        }
    }
}
