// Kombinasyon Hesaplayan Program

import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nNum, rNum;
        long nFact=1, rFact=1, n_rfact=1;
        System.out.println("C(n,r) kombinasyonu için n ve r giriniz.");
        do {
            System.out.print("n için 0'dan büyük tamsayı giriniz: ");
            nNum = input.nextInt();
            System.out.print("r için 0 veya daha büyük tamsayı giriniz: ");
            rNum = input.nextInt();
            if (nNum < rNum) {
                System.out.println("n değeri r'den küçük olamaz!");
            }
        } while (nNum<=0 || rNum<0 || nNum<rNum);

        int i=1, k=1, m=1;
        while (i<=nNum || k<=rNum || m<=(nNum-rNum)) {
            if (i<=nNum) {
                nFact *=i;
                i++;
            }
            if (k<=rNum) {
                rFact *= k;
                k++;
            }
            if (m<=(nNum-rNum)) {
                n_rfact *= m;
                m++;
            }
        }

        long sonuc = (nFact / (rFact * n_rfact));
        System.out.println(nNum + "! = " + nFact);
        System.out.println(rNum + "! = " + rFact);
        System.out.println("C(" + nNum + "," + rNum + ") = " + sonuc);
    }
}
