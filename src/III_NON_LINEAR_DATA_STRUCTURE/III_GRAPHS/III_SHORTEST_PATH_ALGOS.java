

//DIJKSTRA!! =====> GREEDY ALGO!!
//package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//class Edge{
//    int src;
//    int dest;
//    int wght;
//    Edge(int s, int e,int w){
//        this.src = s;
//        this.dest = e;
//        this.wght = w;
//    }
//
//
//}
//class Pair implements Comparable<Pair> {
//    int node;
//    int dist;
//    public Pair(int n,int d){
//        this.node=n;
//        this.dist=d;
//    }
//
//    @Override
//    public int compareTo(Pair p2) {
//        return this.dist - p2.dist;//ASCENDING..FOR DESCENDING ulta..
//    }
//}
//public class III_SHORTEST_PATH_ALGOS {
//    public static void constructGraphs(ArrayList<Edge> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0, 1, 2));
//        graph[0].add(new Edge(0, 2, 4));
//
//        graph[1].add(new Edge(1, 3, 7));
//        graph[1].add(new Edge(1, 2, 1));
//
//        graph[2].add(new Edge(2, 4, 3));
//
//        graph[3].add(new Edge(3, 5, 1));
//
//        graph[4].add(new Edge(4, 3, 2));
//        graph[4].add(new Edge(4, 5, 5));
//
//    }
//
//    public static void dijkstra(ArrayList<Edge> graph[], int src,int V) {
//        PriorityQueue<Pair> pq = new PriorityQueue<>();
//        int dist[] = new int[V];
//
//        for (int i=0;i<V;i++){
//            if (i!=src){
//                dist[i]=Integer.MAX_VALUE;
//            }
//        }
//        boolean vis[] = new boolean[V];
//
//        pq.add(new Pair(src,0));
//
//        while (!pq.isEmpty()){
//            Pair curr = pq.remove();
//            if (!vis[curr.node]){
//                vis[curr.node]=true;
//                for (int i=0;i<graph[curr.node].size();i++){
//                    Edge e = graph[curr.node].get(i);
//                    int u = e.src;
//                    int v = e.dest;
//                    if (!vis[v] && dist[u]+e.wght<dist[v]){
//                        dist[v]=dist[u]+e.wght;
//                        pq.add(new Pair(v,dist[v]));
//                    }
//                }
//            }
//
//        }
//        for (int i=0;i<V;i++){
//            System.out.print(dist[i]+" ");
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int V = 6;
//        ArrayList<Edge> graph[] = new ArrayList[V];
//        constructGraphs(graph);
//
//        dijkstra(graph,0,V);
//    }
//}


//NOW WHAT IS WEIGHTS ARE NEGATIVE!!..????? THEN................
//BELLMAN FORD ALGO!!! =========> DP!!!
//
//package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//class Edge{
//    int src;
//    int dest;
//    int wght;
//    Edge(int s, int e,int w){
//        this.src = s;
//        this.dest = e;
//        this.wght = w;
//    }
//
//
//}
//class Pair implements Comparable<Pair> {
//    int node;
//    int dist;
//    public Pair(int n,int d){
//        this.node=n;
//        this.dist=d;
//    }
//
//    @Override
//    public int compareTo(Pair p2) {
//        return this.dist - p2.dist;//ASCENDING..FOR DESCENDING ulta..
//    }
//}
//public class III_SHORTEST_PATH_ALGOS {
//    public static void constructGraphs(ArrayList<Edge> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0, 1, 2));
//        graph[0].add(new Edge(0, 2, 4));
//
//        graph[1].add(new Edge(1, 3, 7));
//        graph[1].add(new Edge(1, 2, 1));
//
//        graph[2].add(new Edge(2, 4, 3));
//
//        graph[3].add(new Edge(3, 5, 1));
//
//        graph[4].add(new Edge(4, 3, 2));
//        graph[4].add(new Edge(4, 5, 5));
//
//    }
//
//    public static void bellmanFord(ArrayList<Edge> graph[], int src) {
//        int dist[] = new int[graph.length];
//        for(int i=0; i<dist.length; i++) {
//            if (i != src)
//                dist[i] = Integer.MAX_VALUE;
//        }
//
//        for (int i=0;i<graph.length-1;i++) {
//            for (int j = 0; j < graph.length; j++) {
//                for (int k = 0; k < graph[j].size(); k++) {
//                    Edge e = graph[j].get(k);
//                    int u = e.src;
//                    int v = e.dest;
//                    int wt = e.wght;
//
//                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
//                        dist[v] = dist[u]+wt;
//                    }
//                }
//            }
//        }
//
//            for (int j = 0; j < graph.length; j++) {
//                for (int k = 0; k < graph[j].size(); k++) {
//                    Edge e = graph[j].get(k);
//                    int u = e.src;
//                    int v = e.dest;
//                    int wt = e.wght;
//
//                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
//                        System.out.println("Negative Weight cycle exists!!");
//                        break;
//                    }
//                }
//            }
//
//
//
//
//        for (int i = 0; i < dist.length; i++) {
//            System.out.print(dist[i] + " ");
//        }
//        System.out.println();
//    }
//
//
//    public static void main(String[] args) {
//        int V = 6;
//        ArrayList<Edge> graph[] = new ArrayList[V];
//        constructGraphs(graph);
//
//        bellmanFord(graph,0);
//    }
//}