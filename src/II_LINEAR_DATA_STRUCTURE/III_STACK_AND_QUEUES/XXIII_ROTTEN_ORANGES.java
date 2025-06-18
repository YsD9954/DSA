package II_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;

public class XXIII_ROTTEN_ORANGES {

    static boolean spreadRot(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        boolean changed = false;

        int[][] copy = new int[n][m];
        // Copy original array
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                copy[i][j] = arr[i][j];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copy[i][j] == 2) {
                    // top
                    if (i > 0 && arr[i - 1][j] == 1) {
                        arr[i - 1][j] = 2;
                        changed = true;
                    }
                    // bottom
                    if (i < n - 1 && arr[i + 1][j] == 1) {
                        arr[i + 1][j] = 2;
                        changed = true;
                    }
                    // left
                    if (j > 0 && arr[i][j - 1] == 1) {
                        arr[i][j - 1] = 2;
                        changed = true;
                    }
                    // right
                    if (j < m - 1 && arr[i][j + 1] == 1) {
                        arr[i][j + 1] = 2;
                        changed = true;
                    }
                }
            }
        }

        return changed;
    }

    static int rotten_oranges(int[][] arr) {
        int time = 0;

        while (spreadRot(arr)) {
            time++;
        }

        // Check if any fresh orange is still left
        for (int[] row : arr)
            for (int cell : row)
                if (cell == 1)
                    return -1;

        return time;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {0, 1, 2},
                {0, 1, 2},
                {2, 1, 1}
        };

        int count = rotten_oranges(arr);
        System.out.println(count);
    }
}
