import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, u, alan;

        System.out.print("1. kenarı giriniz: ");
        a = input.nextDouble();
        System.out.print("2. kenarı giriniz: ");
        b = input.nextDouble();
        System.out.print("3. kenarı giriniz: ");
        c = input.nextDouble();

        u = (a+b+c) / 2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        String cikti = alan>0 ? "Girdiğiniz üçgenin alanı: " : "Lütfen üçgen oluşturacak sayılar giriniz. ";
        System.out.println(cikti + alan);
    }
}
