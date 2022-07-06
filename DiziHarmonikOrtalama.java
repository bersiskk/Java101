public class DiziHarmonikOrtalama {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 8};
        double sum = 0;

        for (int i : numbers) {
            sum += 1.0 / i;
        }

        System.out.println("Dizideki sayıların harmonik ortalaması: " + numbers.length / sum);
    }
}
