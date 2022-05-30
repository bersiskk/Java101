import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, un="patika", pw="java123";
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifre giriniz: ");
        password = input.nextLine();

        if (userName.equals(un) && password.equals(pw)) {
            System.out.println("Başarıyla giriş yaptınız.");
        } else {
            System.out.println("Bilgileriniz yanlış!");
            System.out.print("Şifrenizi sıfırlamak istiyorsanız '1' tuşuna basınız. ");
            String answer = input.nextLine();
            if (answer.equals("1")) {
                System.out.print("Yeni şifre giriniz: ");
                String pw2 = input.nextLine();
                if (pw2.equals(pw)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Şifrenizi tekrar giriniz.");
            }
        }
    }
}
