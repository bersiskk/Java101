// Kullanıcının girdiği değerler ile üslü sayı hesaplayan programı for döngüsü ile yazıyoruz.

import java.util.Scanner;
public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, n;

        do {
            System.out.print("a^n hesaplamak için pozitif a tam sayısını giriniz: ");
            a = input.nextInt();
            System.out.print("pozitif n sayısını giriniz: ");
            n = input.nextInt();
            if (a==0 && n==0) {
                System.out.println("0^0 belirsizliktir, lütfen tekrar deneyiniz!");
            }
        } while (a==0 && n==0);

        int sonuc = 1;

        for (int i=1; i<=n; i++) {
            sonuc *= a;
        }

        System.out.println(a + "^" + n + " = " + sonuc);
    }
}
