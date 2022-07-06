public class DiziEnYakinSayi {

    static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    static int arrayMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int closestLower(int[] arr, int n) {
        int closest = arrayMin(arr), dif = (n - closest);
        for (int i : arr) {
            if ((i < n) && ((n - i) < dif)) {
                closest = i;
                dif = (n - closest);
            }
        }
        return closest;
    }

    static int closestHigher(int[] arr, int n) {
        int closest = arrayMax(arr), dif = (closest - n);
        for (int i : arr) {
            if ((i > n) && ((i - n) < dif)) {
                closest = i;
                dif = (closest - n);
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0}; // Girilen dizi
        int n = 5; // Girilen sayı

        System.out.println("Min: " + arrayMin(arr) + " , Max: " + arrayMax(arr));

        System.out.println("Girilen sayıdan küçük en yakın sayı:" + closestLower(arr, n));
        System.out.println("Girilen sayıdan büyük en yakın sayı:" + closestHigher(arr, n));
    }
}
