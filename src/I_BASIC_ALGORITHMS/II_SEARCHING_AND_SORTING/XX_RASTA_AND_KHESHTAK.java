package II_BASIC_ALGORITHMS.II_SEARCHING_AND_SORTING;

public class XX_RASTA_AND_KHESHTAK {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 7}
        };

        int[][] b = {
                {1, 2, 3, 4},
                {5, 6, 0, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 0}
        };

        int n = a.length;

        System.out.println("Common square submatrices in a and b:\n");

        for (int size = 1; size <= n; size++) {
            for (int i = 0; i <= n - size; i++) {
                for (int j = 0; j <= n - size; j++) {
                    boolean isSame = true;

                    // Compare submatrices of 'size' at position (i,j)
                    for (int x = 0; x < size; x++) {
                        for (int y = 0; y < size; y++) {
                            if (a[i + x][j + y] != b[i + x][j + y]) {
                                isSame = false;
                                break;
                            }
                        }
                        if (!isSame) break;
                    }

                    if (isSame) {
                        System.out.println("Common submatrix of size " + size + "x" + size + " at (" + i + "," + j + "):");
                        for (int x = 0; x < size; x++) {
                            for (int y = 0; y < size; y++) {
                                System.out.print(a[i + x][j + y] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}
