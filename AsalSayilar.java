// Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

public class AsalSayilar {
    public static void main(String[] args) {
        boolean asalMi;

        for (int i = 2; i <= 100; i++) {
            asalMi = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}
