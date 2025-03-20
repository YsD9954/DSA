import java.util.*;
public class BFS {
    public static void main(String[] args) {
        LinkedList<Integer>[] graph = new LinkedList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new LinkedList<>();
        }
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);
        bfs(graph, 0);
    }
    public static void bfs(LinkedList<Integer>[] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        System.out.print("BFS: ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}


