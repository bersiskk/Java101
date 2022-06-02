/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
 çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/

import java.util.Scanner;
public class DordunKatiSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, toplam=0;
        do {
            System.out.print("Tamsayı giriniz: ");
            sayi = input.nextInt();
            if (sayi % 4 == 0) {    // Çift VE 4'ün katları ifadesi 4'ün katlarını tanımlar.
                toplam += sayi;     // Çift VEYA 4'ün katları olsaydı 2'nin katlarını tanımlardı.
            }
        } while (sayi % 2 == 0);

        System.out.println("Çift ve 4'ün katları olan sayıların toplamı = " + toplam);
    }
}
