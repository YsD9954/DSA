package I_BASIC_ALGORITHMS.VII_BACKTRACKING;

import java.util.*;


public class XIV_SHORTEST_SAFE_ROUTE {
    public static int findShortestPath(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        int[][] arr = new int[r][c];

        // Step 1: Mark unsafe cells
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = 1; // Initially assume all safe
            }
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 0) {
                    arr[i][j] = 0;
                    for (int k = 0; k < 4; k++) {
                        int ni = i + dx[k], nj = j + dy[k];
                        if (ni >= 0 && ni < r && nj >= 0 && nj < c) {
                            arr[ni][nj] = 0;
                        }
                    }
                }
            }
        }

        // Step 2: Start BFS from safe cells in first column
        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            if (arr[i][0] == 1) {
                q.offer(new int[]{i, 0, 1}); // row, col, distance
                vis[i][0] = true;
            }
        }

        // Step 3: BFS
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0], y = curr[1], steps = curr[2];

            if (y == c - 1) return steps;

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k], ny = y + dy[k];
                if (nx >= 0 && nx < r && ny >= 0 && ny < c &&
                        arr[nx][ny] == 1 && !vis[nx][ny]) {
                    vis[nx][ny] = true;
                    q.offer(new int[]{nx, ny, steps + 1});
                }
            }
        }

        // Step 4: No path found
        return -1;
    }
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 1, 1, 1},
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 0}
        };

        int result = findShortestPath(mat);
        System.out.println("Shortest Safe Path: " + result);
    }

}
