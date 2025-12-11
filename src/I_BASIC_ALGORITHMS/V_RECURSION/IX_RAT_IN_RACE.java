
package I_BASIC_ALGORITHMS.V_RECURSION;
import java.util.*;
public class IX_RAT_IN_RACE {

    static class Solution {
        public void dfs(int row, int col, int[][] maze, boolean[][] vis,
                        ArrayList<String> ans, String path) {

            if (vis[row][col]) return;
            if (maze[row][col] == 0) return;

            // destination
            if (row == maze.length - 1 && col == maze.length - 1) {
                ans.add(path);
                return;
            }

            vis[row][col] = true;

            // DOWN
            if (row + 1 < maze.length && maze[row + 1][col] == 1) {
                dfs(row + 1, col, maze, vis, ans, path + "D");
            }

            // UP
            if (row - 1 >= 0 && maze[row - 1][col] == 1) {
                dfs(row - 1, col, maze, vis, ans, path + "U");
            }

            // RIGHT
            if (col + 1 < maze.length && maze[row][col + 1] == 1) {
                dfs(row, col + 1, maze, vis, ans, path + "R");
            }

            // LEFT
            if (col - 1 >= 0 && maze[row][col - 1] == 1) {
                dfs(row, col - 1, maze, vis, ans, path + "L");
            }

            vis[row][col] = false; // backtrack
        }

        public ArrayList<String> ratInMaze(int[][] maze) {
            int n = maze.length;
            boolean[][] vis = new boolean[n][n];
            ArrayList<String> ans = new ArrayList<>();

            dfs(0, 0, maze, vis, ans, "");

            Collections.sort(ans);   // lexicographical sort
            return ans;
        }
    }

    public static void main(String[] args) {

        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };

        Solution sol = new Solution();
        ArrayList<String> paths = sol.ratInMaze(maze);

        System.out.println(paths);
    }
}
