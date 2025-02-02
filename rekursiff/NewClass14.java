package ornek1;
//kpog tek boyutlu tam sayi dizisinin sirali olup olmadigini geri donduren rekursif metod

public class NewClass14 {

    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5};
        boolean t = siralimi(x, 0);
        System.out.println(t);
    }

    public static boolean siralimi(int a[], int n) {
        if (n == a.length - 1) {
            return true;
        } else if (a[n] < a[n + 1]) {
            return siralimi(a, n + 1);
        } else {
            return false;

        }
    }
}
