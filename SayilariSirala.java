import java.util.Scanner;
public class SayilariSirala {
    public static void main(String[] args) {
        double a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("1. sayıyı (a) giriniz: ");
        a = inp.nextDouble();
        System.out.print("2. sayıyı (b) giriniz: ");
        b = inp.nextDouble();
        System.out.print("3. sayıyı (c) giriniz: ");
        c = inp.nextDouble();

        if ((a<b) && (a<c)) {
            if (b<c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if ((b<a) && (b<c)) {
            if (a<c) {
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else if ((c<a) && (c<b)) {
            if (a<b) {
                System.out.println("c < a < b");
            } else {
                System.out.println("c < b < a");
            }
        } else {
            System.out.println("Lütfen birbirinden farklı sayılar giriniz!");
        }
    }
}
