// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;
public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, a=-1;

        do {
            System.out.print("0'dan büyük bir tamsayı giriniz: ");
            sayi = input.nextInt();
        } while (sayi <= 0);

        System.out.println("Girdiğiniz sayıya kadar 2'nin kuvvetleri:");

        for (int i=1, k=1; (i<=sayi && k<=sayi); i*=4, k*=5) {
            a += 1;
            System.out.println(i + " = 4^" + a + ", " + k + " = 5^" + a);
        }
    }
}
