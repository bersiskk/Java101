import java.util.Scanner;

public class DizideSiralama {
    static int[] arraySort(int[] arr) {
        int[] sorted = new int[arr.length];
        int[] index = new int[arr.length];

        int lower;
        boolean isCont;

        for (int i = 0; i < arr.length; i++) {
            lower = Integer.MAX_VALUE;

            for (int j = 0; j < arr.length; j++) {
                isCont = true;

                for (int k = 0; k < i; k++) {
                    if (j == index[k]) {
                        isCont = false;
                        break;
                    }
                }

                if (isCont && (arr[j] < lower)) {
                    lower = arr[j];
                    index[i] = j;
                }
            }
            sorted[i] = lower;
        }
        return sorted;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu (n) : ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". eleman : ");
            arr[i] = scan.nextInt();
        }

        System.out.print("Sıralama : " );

        for (int j : arraySort(arr)) {
            System.out.print(j + " ");
        }
    }
}
