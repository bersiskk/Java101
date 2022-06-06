/* Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile
    ekrana ters üçgen çizen programı yazın. */

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int a = input.nextInt();

        for (int i = a; i >= 1; i--) {
            for (int k = 1; k <= a - i; k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2*i - 1; m++) {
                System.out.print("*");
            }
            for (int n = 1; n <= a - i; n++) {
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
