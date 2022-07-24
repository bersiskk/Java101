import java.util.Scanner;

public class PalindromikKelime {
    static void isPalindrome(String str) {
        String str2 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }

        String result = str2.equals(str) ? "Palindromik kelimedir." : "Palindromik kelime değildir.";

        System.out.println("\"" + str + "\" " + result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen kelimeyi giriniz: ");
        isPalindrome(scan.nextLine());
    }
}
