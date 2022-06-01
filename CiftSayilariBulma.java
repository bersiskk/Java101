/* Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
    ortalamasını hesaplayan programı yazınız. */

import java.util.Scanner;
public class CiftSayilariBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        do {
            System.out.print("Lütfen 0'dan büyük bir tam sayı giriniz: ");
            sayi = input.nextInt();
        } while (sayi <= 0);

        double toplam = 0, adet = 0;
        for (int i = 1; i <= sayi; i++) {
            if (i % 12 == 0) {
                toplam += i;
                adet += 1;
                /* Sorudaki 3 ve 4'e tam bölünen kavramı 12'ye tam bölünme anlamına geliyor.
                Eğer 3 veya 4'e denmiş olsaydı yorum içine almış olduğum satırlar da koda eklenecekti. */
//            } else if (i % 3 == 0) {
//                toplam += i;
//                adet += 1;
//            } else if (i % 4 == 0) {
//                toplam += i;
//                adet += 1;
            }
        }

        double ortalama = toplam / adet;
        if (toplam != 0) {
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması = " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı yok!");
        }
    }
}
