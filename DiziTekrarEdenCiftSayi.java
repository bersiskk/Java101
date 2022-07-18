public class DiziTekrarEdenCiftSayi {

    static int countZero(int[] arr) {
        int c0 = 0;
        for (int i : arr) {
            if (i == 0) {
                c0 += 1;
            }
        }
        return c0;
    }

    static boolean isFind(int[] arr, int x) {
        for (int i : arr) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }

    static int[] repeating(int[] arr) {
        int[] duplicate = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i]) == arr[j]) {
                    if (!isFind(duplicate, arr[i])) {
                        duplicate[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        return duplicate;
    }

    static void printRepeatingEven(int[] arr) {
        int c0 = countZero(arr);
        for (int i : repeating(arr)) {
            if (i % 2 == 0) {
                if (i == 0 && c0 != 0) {
                    System.out.print(i + " ");
                    c0 = 0;
                } else if (i != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 4, 2, 3, 4, 16, 0, 5, 5, 16};

        printRepeatingEven(arr);
    }
}
