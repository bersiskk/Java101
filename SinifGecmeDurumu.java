import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        double mat, fiz, tur, kim, muz;
        Scanner inp = new Scanner(System.in);

        int count = 0;

        System.out.print("Matematik notunuz: ");
        mat = inp.nextDouble();
        if (mat>0 && mat<100) { count += 1;}

        System.out.print("Fizik notunuz: ");
        fiz = inp.nextDouble();
        if (fiz>0 && fiz<100) { count += 1;}

        System.out.print("Türkçe notunuz: ");
        tur = inp.nextDouble();
        if (tur>0 && tur<100) { count += 1;}

        System.out.print("Kimya notunuz: ");
        kim = inp.nextDouble();
        if (kim>0 && kim<100) { count += 1;}

        System.out.print("Müzik notunuz: ");
        muz = inp.nextDouble();
        if (muz>0 && muz<100) { count += 1;}

        double average = (mat + fiz + tur + kim + muz) / count;
        System.out.println("Ortalamanız: " + average);
        if (count != 0) {
            if (average <= 55) {
                System.out.println("Sınıfta kaldınız.");
            } else {
                System.out.println("Sınıfı geçtiniz.");
            }
        } else {
            System.out.println("Lütfen en az bir ders için 0-100 arasında not giriniz.");
        }
    }
}
