import java.util.Scanner;

public class DaireAlaniVeCevresi {
    public static void main(String[] args) {
        double yaricap, alan, cevre, aci;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        yaricap = girdi.nextDouble();
        System.out.print("Merkez açıyı giriniz: ");
        aci = girdi.nextDouble();

        alan = Math.PI * (yaricap * yaricap) * (aci / 360);
        cevre = 2 * Math.PI * yaricap * (aci / 360);
        System.out.println("Daire diliminin alanı: " + alan);
        System.out.println("Çember parçasının yay uzunluğu: " + cevre);
    }
}
