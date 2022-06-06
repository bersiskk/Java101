/* Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana
 “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız. */

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı giriniz: ");
        int n = input.nextInt(), s = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }

        String str = (s == n) ? " mükemmel sayıdır." : " mükemmel sayı değildir.";
        System.out.println(n + str);
    }
}
