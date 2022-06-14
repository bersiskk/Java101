public class PalindromSayi {
    static boolean palindrom(int x) {
        int a = x, b = x, c = 0;

        while (true) {
            b = a % 10;
            c = c * 10 + b;
            a /= 10;
            if (a == 0) {
                break;
            }
        }

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
