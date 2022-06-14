import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplama sonucu = " + result);
    }

    static void extract(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma sonucu = " + result);
    }

    static void multiple(int a, int b) {
        int rslt = a * b;
        System.out.println("Çarpma sonucu = " + rslt);
    }

    static void division(double a, double b) {
        double result = a / b;
        System.out.println("Bölme sonucu = " + result);
    }

    static void power(int a, int b) {
        int result;
        if (a == 0) {
            result = 0;
        } else {
            result = 1;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        }
        System.out.println("Üslü işlem sonucu = " + result);
    }

    static void factorial(int a) {
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result *= i;
        }
        System.out.println("Faktöriyel sonucu = " + result);
    }

    static void mod(int a, int b) {
        int result = a % b;
        System.out.println("Mod sonucu = " + result);
    }

    static void rectangular(int a, int b) {
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Dikdörtgenin alanı = " + area + ", Çevresi = " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = "*******************************\n"
                + "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme İşlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n"
                + "";

        while (true) {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            int choice = scan.nextInt();

            if (choice == 0) {
                break;
            } else if (choice < 0 || choice > 8) {
                continue;
            }

            System.out.print("1. sayıyı giriniz: ");
            int a = scan.nextInt();
            System.out.print("2. sayıyı giriniz: ");
            int b = scan.nextInt();

            switch (choice) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    extract(a, b);
                    break;
                case 3:
                    multiple(a, b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("2. sayı 0 olamaz!");
                        break;
                    }
                    division(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    if (a < 0) {
                        System.out.println("1. sayıyı 0'dan büyük giriniz!");
                    } else {
                        factorial(a);
                    }
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    rectangular(a, b);
                    break;
                default:
                    System.out.println("Lütfen 0 ile 8 arasında bir rakam giriniz!");
                    break;
            }
        }

        System.out.println("Hoşçakalın!");

    }
}
