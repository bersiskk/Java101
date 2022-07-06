public class DiziBYazdirma {
    public static void main(String[] args) {
        String[][] arr = new String[7][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!(i == 0 || i == 3 || i == 6) && (j == 1 || j == 2)) {
                    arr[i][j] = "   ";
                } else if ((i == 0 || i == 3 || i == 6) && (j == 3)) {
                    arr[i][j] = "   ";
                } else {
                    arr[i][j] = " * ";
                }
            }
        }

        for (String[] row : arr) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}