import java.util.Scanner;

public class AsalSayiRecursive {
    static int asal(int a, int b) {
        if (b <= 2) {
            return 0;
        }
        if (a % (b - 1) == 0) {
            return 1;
        }
        return asal(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı giriniz: ");
        int n = scan.nextInt();

        String str = (asal(n, n) == 0) ? " ASALDIR!" : " ASAL DEĞİLDİR!";
        System.out.println(n + str);
    }
}
