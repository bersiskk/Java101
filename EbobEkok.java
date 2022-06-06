// Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 0;

        do {
            System.out.print("1. pozitif tam sayıyı giriniz: ");
            n1 = input.nextInt();
            System.out.print("2. pozitif tam sayıyı giriniz: ");
            n2 = input.nextInt();
            if (n1 <= 0 || n2 <= 0) {
                System.out.println("Lütfen 0'dan büyük tam sayılar giriniz!");
            }
        } while (n1 <= 0 || n2 <= 0);

        int i = 1;
        while (i <= n1 || i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        System.out.println("EBOB = " + ebob);
        int ekok = n1 * n2 / ebob;
        System.out.println("EKOK = " + ekok);
    }
}
