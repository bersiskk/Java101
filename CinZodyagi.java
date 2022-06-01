import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        // Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int year = input.nextInt();
        int result = year % 12;
        String str = "";
        switch (result) {
            case 0:
                str = "Maymun";
                break;
            case 1:
                str = "Horoz";
                break;
            case 2:
                str = "Köpek";
                break;
            case 3:
                str = "Domuz";
                break;
            case 4:
                str = "Fare";
                break;
            case 5:
                str = "Öküz";
                break;
            case 6:
                str = "Kaplan";
                break;
            case 7:
                str = "Tavşan";
                break;
            case 8:
                str = "Ejderha";
                break;
            case 9:
                str = "Yılan";
                break;
            case 10:
                str = "At";
                break;
            case 11:
                str = "Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz: " + str);

    }
}