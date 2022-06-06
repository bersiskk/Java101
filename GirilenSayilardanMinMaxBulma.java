/* Java ile klavyeden girilen N tane sayma sayısından en büyük ve
    en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın. */

import java.util.Scanner;

public class GirilenSayilardanMinMaxBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet tam sayı gireceksiniz? : ");
        int n = input.nextInt();

        int a, lowest = Integer.MAX_VALUE, highest = Integer.MIN_VALUE;
        int i = 1;

        while (i <= n) {
            System.out.print(i + ". tam sayıyı giriniz: ");
            a = input.nextInt();
            if (a <= lowest) {
                lowest = a;
            }
            if (a >= highest) {
                highest = a;
            }
            i++;
        }

        System.out.println("En küçük sayı = " + lowest);
        System.out.println("En büyük sayı = " + highest);
    }
}
