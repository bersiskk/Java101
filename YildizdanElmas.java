// Döngüler kullanarak yıldızlar ile elmas yapınız.

import java.util.Scanner;
public class YildizdanElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        do {
            System.out.print("Pozitif tam sayı giriniz: ");
            n = input.nextInt();
        } while (n <= 0);

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            for (int m=1; m<=n-i; m++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        for (int i=n-1; i>=1; i--) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            for (int m=1; m<=n-i; m++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
