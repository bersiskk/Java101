import java.util.Arrays;

public class DizideFrekans {
    static void freq(int[] arr) {
        boolean isCont, haveZero = false;
        int index = 0;

        int[] num = new int[arr.length];
        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            isCont = false;
            if (arr[i] == 0) haveZero = true;

            for (int k = 0; k < i; k++) {
                if (arr[i] == num[k]) {
                    isCont = true;
                    break;
                }
            }

            if (isCont) continue;
            num[index++] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j : arr) {
                if (num[i] == j) {
                    count[i] += 1;
                }
            }
        }

        System.out.println("\nDizi : " + Arrays.toString(arr));
        System.out.println("Eleman sayıları:");

        for (int j = 0; j < arr.length; j++) {
            if (haveZero || num[j] != 0) {
                System.out.println(num[j] + " sayısından " + count[j] + " tane var.");
                if (num[j] == 0) haveZero = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 0, 20, 10, 5, 20, 20, 0, 10};
        freq(arr);
    }
}
