//package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;
//import java.util.*;
//
//class NoOfProvinces {
//
//    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int[] vis) {
//        vis[node] = 1;
//        for (Integer it : adjLs.get(node)) {
//            if (vis[it] == 0) {
//                dfs(it, adjLs, vis);
//            }
//        }
//    }
//
//    public static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
//        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
//
//        // Convert adjacency matrix to adjacency list
//        for (int i = 0; i < V; i++) {
//            adjLs.add(new ArrayList<>());
//        }
//
//        for (int i = 0; i < V; i++) {
//            for (int j = 0; j < V; j++) {
//                if (adj.get(i).get(j) == 1 && i != j) {
//                    adjLs.get(i).add(j);
//                    adjLs.get(j).add(i); // because it's undirected
//                }
//            }
//        }
//
//        int[] vis = new int[V];
//        int count = 0;
//
//        for (int i = 0; i < V; i++) {
//            if (vis[i] == 0) {
//                count++;
//                dfs(i, adjLs, vis);
//            }
//        }
//
//        return count;
//    }
//}
//public class NO_OF_PROVINCES {
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//        adj.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
//        adj.add(new ArrayList<>(Arrays.asList(0, 1, 0)));
//        adj.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
//
//        int V = 3;
//        System.out.println("Number of provinces: " + NoOfProvinces.numProvinces(adj, V));
//    }
//}
