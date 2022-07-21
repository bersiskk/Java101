import java.util.Arrays;

public class MatrisTranspozuBulma {
    static void printTranspoze(int[][] matrix) {
        int[][] transpoze = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < transpoze.length; i++) {
            for (int j = 0; j < transpoze[0].length; j++) {
                transpoze[i][j] = matrix[j][i];
            }
        }

        System.out.println("Matris:");

        for (int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }

        System.out.println("\nTranspoz:");

        for (int[] i : transpoze) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6},};

        printTranspoze(matrix);
    }
}
