// 3 basamaklı Armstrong sayılarını bulan program.

public class UcBasamakliArmstrongSayilari {
    public static void main(String[] args) {
        System.out.println("3 basamaklı Armstrong sayıları:");

        for (int sayi=100; sayi<=999; sayi++) {
            int n = 1, bolum = sayi / 10;

            while (bolum >= 1) {
                bolum /= 10;
                n++;
            }
            // n : hane sayısı

            int a=sayi, b, c, d=0;
            for (int i=1; i<=n; i++) {
                b = a % 10;
                c = b;
                for (int k=2; k<=n; k++) {
                    c *= b;
                }
                d += c;
                a /= 10;
            }

            if (sayi == d) {
                System.out.println(sayi);
            }
        }
    }
}
