import java.util.Scanner;

public class DeseneGoreMetot {
    static int desen(int a, int b) {
        System.out.print(b + " ");
        if (b <= 0) {
            return desen2(a, b + 5);
        }
        return desen(a, b - 5);
    }

    static int desen2(int a, int b) {
        System.out.print(b + " ");
        if (a == b) {
            return 0;
        }
        return desen2(a, b + 5);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif n sayısını giriniz: ");
        int n = scan.nextInt();

        desen(n, n);
    }
}
