//package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;
//import java.util.*;
//
//class Pair {
//    int x, y, steps;
//
//    Pair(int x, int y, int steps) {
//        this.x = x;
//        this.y = y;
//        this.steps = steps;
//    }
//}
//
//public class STEPS_BY_KNIGHTS{
//    // All 8 possible moves for a knight
//    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
//    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
//
//    public static int minSteps(int n, int[] knightPos, int[] targetPos) {
//        // Convert 1-based to 0-based
//        int startX = knightPos[0] - 1;
//        int startY = knightPos[1] - 1;
//        int endX = targetPos[0] - 1;
//        int endY = targetPos[1] - 1;
//
//        // Edge case: already at destination
//        if (startX == endX && startY == endY) return 0;
//
//        boolean[][] visited = new boolean[n][n];
//        Queue<Pair> queue = new LinkedList<>();
//        queue.add(new Pair(startX, startY, 0));
//        visited[startX][startY] = true;
//
//        while (!queue.isEmpty()) {
//            Pair curr = queue.poll();
//
//            for (int i = 0; i < 8; i++) {
//                int newX = curr.x + dx[i];
//                int newY = curr.y + dy[i];
//
//                if (isInsideBoard(newX, newY, n) && !visited[newX][newY]) {
//                    if (newX == endX && newY == endY) {
//                        return curr.steps + 1;
//                    }
//
//                    visited[newX][newY] = true;
//                    queue.add(new Pair(newX, newY, curr.steps + 1));
//                }
//            }
//        }
//
//        return -1; // Not reachable (should not happen as knight can reach anywhere)
//    }
//
//    private static boolean isInsideBoard(int x, int y, int n) {
//        return (x >= 0 && x < n && y >= 0 && y < n);
//    }
//
//    public static void main(String[] args) {
//        int n = 6;
//        int[] knightPos = {4, 5};    // 1-based
//        int[] targetPos = {1, 1};    // 1-based
//
//        System.out.println("Minimum Steps: " + minSteps(n, knightPos, targetPos));
//    }
//}
