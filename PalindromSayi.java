public class PalindromSayi {
    static boolean palindrom(int x) {
        int a = x, b, c = 0;

        do {
            b = a % 10;
            c = c * 10 + b;
            a /= 10;
        } while (a != 0);

        return x == c;
    }

    public static void main(String[] args) {
        System.out.println("0-9999 arasındaki Palindrom sayılar:");

        for (int i = 0; i <= 9999; i++) {
            if (palindrom(i)) {
                System.out.println(i);
            }
        }
    }
}
