package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;

import java.util.*;

public class RAT_IN_MAZE {

    static int n;
    static List<String> allPaths = new ArrayList<>();

    // DFS function to explore paths
    static void dfs(char[][] grid, int x, int y, boolean[][] visited, StringBuilder path) {
        // Base condition: destination reached
        if (x == n - 1 && y == n - 1) {
            allPaths.add(path.toString());
            return;
        }

        // Directions: Down, Left, Right, Up
        int[] dx = {1, 0, 0, -1};
        int[] dy = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};

        // Try all 4 directions
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (isSafe(grid, visited, newX, newY)) {
                // Mark as visited and add direction to path
                visited[newX][newY] = true;
                path.append(dir[i]);

                // Recursive DFS call
                dfs(grid, newX, newY, visited, path);

                // Backtrack: unmark and remove last move
                path.deleteCharAt(path.length() - 1);
                visited[newX][newY] = false;
            }
        }
    }

    // Checks if a move is valid
    static boolean isSafe(char[][] grid, boolean[][] visited, int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == '1' && !visited[x][y]);
    }

    // Main function to trigger DFS from (0, 0)
    private static void ratInMaze(char[][] grid) {
        n = grid.length;
        allPaths.clear();  // Clear any previous result
        boolean[][] visited = new boolean[n][n];
        StringBuilder path = new StringBuilder();

        if (grid[0][0] == '1') {
            visited[0][0] = true;
            dfs(grid, 0, 0, visited, path);
        }

        // Output
        if (allPaths.isEmpty()) {
            System.out.println("No path found!");
        } else {
            for (String p : allPaths) {
                System.out.println("Path: " + p);
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '0', '0', '0'},
                {'1', '1', '0', '1'},
                {'1', '1', '0', '0'},
                {'0', '1', '1', '1'}
        };

        ratInMaze(grid);
    }
}
