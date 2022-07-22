import java.util.Arrays;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);

        int right = 0;
        int[] predictions = new int[5];

        System.out.println("0-100 arasındaki gizli tam sayıyı bulmak için 5 adet hakkınız var.");

        while (right < 5) {
            System.out.print("--- Lütfen tahmininizi giriniz: ");
            int guess = scan.nextInt();
            predictions[right] = guess;

            if (guess == number) {
                System.out.println("Tebrikler, doğru bildiniz! Gizli sayı: " + number);
                break;
            } else {
                if (right == 4) {
                    System.out.println("Kaybettiniz! Gizli sayı: " + number);
                } else {
                    System.out.print("Hatalı tahmin! ");
                    if (guess < number) {
                        System.out.println("Tahmininiz, gizli sayıdan küçük.");
                    } else {
                        System.out.println("Tahmininiz, gizli sayıdan büyük.");
                    }
                    System.out.println("Kalan tahmin hakkınız: " + (4 - right));
                }
            }
            right++;
        }

        System.out.print("Tahminleriniz: ");

        for (int i = 0; i < right; i++) {
            System.out.print(predictions[i] + " ");
        }
    }
}