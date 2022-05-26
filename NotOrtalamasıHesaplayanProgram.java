import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {
    public static void main(String[] args) {
        float mat, fiz, kim, tur, tar, muz;     //Ortalamanın ondalık çıkması için değerler float olarak tanımlandı.
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat = input.nextInt();

        System.out.print("Fizik notu: ");
        fiz = input.nextInt();

        System.out.print("Kimya notu: ");
        kim = input.nextInt();

        System.out.print("Türkçe notu: ");
        tur = input.nextInt();

        System.out.print("Tarih notu: ");
        tar = input.nextInt();

        System.out.print("Müzik notu: ");
        muz = input.nextInt();

        float ort = ((mat + fiz + kim + tur + tar + muz) / 6);
        System.out.println("Ortalamanız: " + ort);
        String kosul = ort>=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(kosul);
    }
}
