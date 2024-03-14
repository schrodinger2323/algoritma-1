package javaapplication18;

//matris carpimi!!!!!!!

public class NewClass11 {

    public static void main(String[] args) {
        int a[][] = {{2, 1}, {2, 2}, {1, 1}};
        int b[][] = {{2, 1, 2, 1}, {1, 2, 1,}};
        int c[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {//i 1.nin satir sayisi
            for (int j = 0; j < 4; j++) {//j 2.nin sutun sayisi
                for (int k = 0; k < 2; k++) {
                    c[i][j] += a[i][k] * b[k][j];

                }
            }
        }
    }
}
