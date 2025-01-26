package algo1;
//1,2/3,3/4,4,5... seklinde giden serinin ilk 5 elemani carpimi

public class NewClass20 {

    public static void main(String[] args) {
        double carpim = 1;
        for (double i = 2; i <= 5; i++) {
            carpim = carpim * (i / (i + 1));
        }
        System.out.println(carpim);
    }
}
