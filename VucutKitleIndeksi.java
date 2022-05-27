import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double kilo, boy, indeks;

        System.out.print("Kilonuzu kilogram olarak giriniz: ");
        kilo = girdi.nextDouble();
        System.out.print("Boyunuzu metre olarak giriniz: ");
        boy = girdi.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
    }
}
