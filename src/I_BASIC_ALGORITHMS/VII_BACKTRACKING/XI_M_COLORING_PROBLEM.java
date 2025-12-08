package I_BASIC_ALGORITHMS.VII_BACKTRACKING;



import java.util.*;
public class XI_M_COLORING_PROBLEM {

    // Main function to start coloring
    public static boolean graphColoring(int[][] graph, int m, int V) {
        int[] color = new int[V]; // To store color assignment to each vertex
        return solve(0, color, graph, V, m);
    }

    // Recursive backtracking function
    private static boolean solve(int node, int[] color, int[][] graph, int V, int m) {
        if (node == V) return true; // All vertices are colored

        // Try all colors from 1 to m
        for (int c = 1; c <= m; c++) {
            if (isSafe(node, graph, color, c, V)) {
                color[node] = c; // Assign color
                if (solve(node + 1, color, graph, V, m)) return true; // Recurse
                color[node] = 0; // Backtrack
            }
        }

        return false; // No color worked
    }

    // Check if it's safe to assign color c to vertex node
    private static boolean isSafe(int node, int[][] graph, int[] color, int c, int V) {
        for (int i = 0; i < V; i++) {
            if (graph[node][i] == 1 && color[i] == c) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int V = 4; // Number of vertices
        int m = 3; // Number of colors

        // Example graph as adjacency matrix
        int[][] edges = {
                {0, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {1, 0, 1, 0}
        };

        System.out.println(graphColoring(edges, m, V) ? "true" : "false");
    }
}
