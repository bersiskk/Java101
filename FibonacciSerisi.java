import java.util.Scanner;
public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Fibonacci serisi için eleman sayısını giriniz: ");
            n = input.nextInt();
        } while (n < 1);

        int a = 0, b = 1, c, i = 2;

        System.out.println(n + " elemanlı Fibonacci serisi:");
        if (n == 0) {
            System.out.print(a);
        } else if (n >= 1) {
            System.out.print(a + ", " + b);
        }
        while (i <= n) {
            c = b;
            b = a + b;
            a = c;
            System.out.print(", " + b);
            i++;
        }
    }
}
