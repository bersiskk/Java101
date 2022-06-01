import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km olarak giriniz: ");
        double dist = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();
        System.out.print("Yolculuk tipiniz seçiniz (1: Tek Yön, 2: Gidiş Dönüş): ");
        int tType = input.nextInt();
        double perKm = 0.10; //km başına tutar

        double disc1; //indirim
        if ((dist>0) && (age>0) && (tType==1 || tType==2)) {
            if (age<12) {
                disc1 = 0.50;
            } else if (age<=24) {
                disc1 = 0.10;
            } else if (age>65) {
                disc1 = 0.30;
            } else {
                disc1 = 0;
            }
            double price1 = (dist * perKm) * (1 - disc1);
            double price2;

            if (tType==2) {
                price2 = 2 * price1 * (1 - 0.20);
            } else {
                price2 = price1;
            }
            System.out.println("Toplam Tutar = " + price2 + " TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
