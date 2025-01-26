package algo1;

//BigInteger sınıfı kullanımı: Büyük sayıları destekler ve 
//matematiksel işlemler için .add(), .multiply() gibi yöntemler sunar.
//Bu şekilde artık çok büyük Fibonacci sayıları da doğru bir şekilde hesaplanır
//ve eksi değerler gösterme sorunu çözülmüş olur
import java.math.BigInteger;

//fibonacci dizisinin ilk 100 elemanini ekrana yazan pr.
public class NewClass27 {

    public static void main(String[] args) {
        BigInteger sayi1 = BigInteger.ONE;
        BigInteger sayi2 = BigInteger.ONE;

        System.out.println(1);
        System.out.println(1);

        BigInteger yeni;
        for (int i = 3; i <= 100; i++) {
            yeni = sayi1.add(sayi2);
            sayi1 = sayi2;
            sayi2 = yeni;
            System.out.println(yeni);
        }

    }
}
