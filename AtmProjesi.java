// Kullanıcının banka hesabını yönetebildiği bir ATM projesini switch-case ile yapıyoruz.

import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right=3, balance=5000, slct, price;
        boolean isTrue = false;

        System.out.println("Hoşgeldiniz!");

        while (right>0 && !isTrue) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            isTrue = userName.equals("patika") && password.equals("java101");

            while (isTrue) {
                slct = 0;
                while (slct<1 || slct>4) {
                    System.out.println("-------------------------------------------------");
                    System.out.print("1: Para yatır\n2: Para çek\n3:Bakiye sorgula\n4:Çıkış yap" +
                            "\nYapmak istediğiniz işlemi seçiniz: ");
                    slct = input.nextInt();
                }

                if (slct == 4) {
                    break;
                }

                switch (slct) {
                    case 1:
                        System.out.print("Yatırmak istediğiniz miktar = ");
                        price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        do {
                            System.out.print("Çekmek istediğiniz miktar = ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Çekebileceğiniz maksimum tutar = " + balance + " TL.");
                            }
                        } while (price > balance);
                        balance -= price;
                        break;
                    case 3:
                        System.out.println("Bakiyeniz = " + balance + " TL.");
                        break;
                }
            }

            if (!isTrue){
                right -= 1;
                System.out.println("Hatalı giriş yaptınız! Kalan giriş hakkınız = " + right);
                if (right == 0) {
                    System.out.println("Kartınız bloke olmuştur. Lütfen bankanız ile iletişime geçiniz.");
                }
            }
        }

        System.out.println("Hoşçakalın!");
    }
}
