import java.util.Scanner;
public class HavaSicakligiEtkinlik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        double heat = inp.nextDouble();

        if (heat <= 25) {
            if (heat >= 15) {
                System.out.println("Pikniğe gidebilirsiniz.");
            } else if (heat < 5) {
                System.out.println("Kayak yapabilirsiniz.");
            } else {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
