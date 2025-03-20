import java.util.*;
public class DFS {
    public static void main(String[] args) {
        LinkedList<Integer>[] graph = new LinkedList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new LinkedList<>();
        }
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);
        dfs(graph, 0);
    }
    public static void dfs(LinkedList<Integer>[] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        System.out.print("DFS: ");
        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");
                for (int neighbor : graph[node]) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
}