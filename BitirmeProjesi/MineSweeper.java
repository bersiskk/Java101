import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int rowCount, colCount, elementCount, mineCount, rowMine, colMine;
    String[][] matrix, mineMatrix;
    int[][] mineLocation;
    boolean isCont;

    MineSweeper(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
    }

    void constructMatrix() {
        matrix = new String[this.rowCount][this.colCount];
        mineMatrix = new String[this.rowCount][this.colCount];

        for (int k = 0; k < this.rowCount; k++) {
            Arrays.fill(matrix[k], "-");
            Arrays.fill(mineMatrix[k], "-");
        }

        elementCount = this.rowCount * this.colCount;
        mineCount = elementCount / 4;
        mineLocation = new int[mineCount][2];

        int i = 0;
        while (i < mineCount) {
            isCont = false;

            rowMine = (int) Math.round(Math.random() * (this.rowCount - 1));
            colMine = (int) Math.round(Math.random() * (this.colCount - 1));

            for (int j = 0; j < i; j++) {
                if (rowMine == mineLocation[j][0] && colMine == mineLocation[j][1]) {
                    isCont = true;
                    break;
                }
            }

            if (isCont) continue;

            mineLocation[i][0] = rowMine;
            mineLocation[i][1] = colMine;
            mineMatrix[rowMine][colMine] = "*";
            i++;
        }
    }

    void print(String[][] arr) {
        for (String[] m : arr) {
            for (int n = 0; n < colCount; n++) {
                System.out.print(m[n] + " ");
            }
            System.out.println("");
        }
    }

    void start() {
        constructMatrix();
        System.out.println("Mayınların konumu:");
        print(mineMatrix);
        System.out.println("============================");
        System.out.println("Mayın Tarlası oyununa hoşgeldiniz!");
    }

    boolean isLost(int row, int col) {
        for (int i = 0; i < mineCount; i++) {
            if (row == mineLocation[i][0] && col == mineLocation[i][1]) {
                return true;
            }
        }
        return false;
    }

    boolean isWin() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (matrix[i][j].equals("-") && mineMatrix[i][j].equals("-")) return false;
            }
        }
        return true;
    }

    void run() {
        start();

        int row, col;

        while (true) {
            Scanner scan = new Scanner(System.in);

            print(matrix);
            System.out.print("Satır giriniz: ");
            row = scan.nextInt();
            System.out.print("Sütun giriniz: ");
            col = scan.nextInt();
            System.out.println("============================");

            if (row < 0 || row >= this.rowCount || col < 0 || col >= this.colCount) {
                System.out.println("Lütfen dizi sınırları içinde bir nokta seçin!");
                continue;
            }

            int count = 0;

            if (isLost(row, col)) {
                System.out.println("Kaybettiniz!");
                break;
            } else {
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (row + i < 0 || row + i >= rowCount || col + j < 0 || col + j >= colCount) {
                            continue;
                        }
                        if (mineMatrix[row + i][col + j].equals("*")) {
                            count += 1;
                        }
                    }
                }
            }

            matrix[row][col] = Integer.toString(count);

            if (isWin()) {
                System.out.println("Tebrikler, kazandınız!");
                print(matrix);
                break;
            }
        }
    }
}