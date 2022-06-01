import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        // Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");

        int yil = input.nextInt();
        boolean artikMi = false;

        if ((yil % 100) == 0) {
            if ((yil % 400) == 0) {
                artikMi = true;
            }
        } else {
            if ((yil % 4) == 0) {
                artikMi = true;
            }
        }

        String sonuc = artikMi ? " bir artık yıldır!" : " bir artık yıl değildir!";
        System.out.println(yil + sonuc);
    }
}
