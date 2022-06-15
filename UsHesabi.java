import java.util.Scanner;

public class UsHesabi {
    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int a = scan.nextInt();
        System.out.print("Kuvveti giriniz: ");
        int b = scan.nextInt();

        System.out.println(a + "^" + b + " = " + power(a, b));
    }
}
