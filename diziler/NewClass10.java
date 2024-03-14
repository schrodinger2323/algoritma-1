package javaapplication18;

//verilen dizinin satirlarini toplayip bir diziye sutunlarini toplayip bir diziye atayan
public class NewClass10 {

    public static void main(String[] args) {

        int A[][] = {{2, 4, 5, 6}, {4, 5, 7, 9}, {4, 1, 4, 6}};
        int satirtop[] = new int[3];
        int sutuntop[] = new int[4];
        int topsat = 0, topsut = 0;
        int k = 0;
        for (int i = 0; i < 3; i++) {

            topsut = 0;
            for (int j = 0; j < 4; j++) {
                topsat += A[i][j];
                if (k < 3) {
                    topsut += A[k][i];
                    k++;
                }
            }
            satirtop[i] = topsat;
            sutuntop[i] = topsut;
            topsat = 0;
            k = 0;
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(satirtop[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 4; i++) {
            System.out.print(sutuntop[i] + " ");
        }
    }
}
