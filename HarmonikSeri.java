// Girilen sayının harmonik serisini bulan program yazacağız.

import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n;

        do {
            System.out.print("1'den büyük bir tam sayı giriniz: ");
            n = input.nextDouble();
        } while (n < 1);

        double toplam = 0;

        for (double i=1; i<=n; i++) {
            toplam += 1 / i;
        }

        System.out.println(n + " sayısının harmonik serisi = " + toplam);
    }
}
