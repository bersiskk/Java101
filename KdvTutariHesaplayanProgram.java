import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double kdvsiz, kdvli, kdv;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        kdvsiz = input.nextFloat();

        kdv = kdvsiz>1000 ? kdvsiz*0.08 : kdvsiz*0.18;
        kdvli = kdvsiz + kdv;
        System.out.println("KDV'siz Fiyat: " + kdvsiz);
        System.out.println("KDV'li Fiyat: " + kdvli);
        System.out.println("KDV Tutarı: " + kdv);
    }
}
