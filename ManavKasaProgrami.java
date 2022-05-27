import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double arm=2.14, elm=3.67, dom=1.11, muz=0.95, pat=5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Armut kaç kilo: ");
        armutKg = girdi.nextDouble();
        System.out.print("Elma kaç kilo: ");
        elmaKg = girdi.nextDouble();
        System.out.print("Domates kaç kilo: ");
        domatesKg = girdi.nextDouble();
        System.out.print("Muz kaç kilo: ");
        muzKg = girdi.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        patlicanKg = girdi.nextDouble();

        double toplam = arm*armutKg + elm*elmaKg + dom*domatesKg + muz*muzKg + pat*patlicanKg;
        System.out.println("Toplam tutar: " + toplam + " TL");
    }
}
