
//MINNING SPANNING TREE=>

//1. ALL VERTEX SHOULD BE COVER..
//2. ALL EDGE MUST BE COVER...
//3. NO CYCLES....
//4. MIN COST ONLY OTHERWIE FOR A GRAPH .....



//                            I. PRIM'S ALGORITHM...

// MAKE A NON MST SET...
//FILL THE MST SET TILL ALL ELEMENT ARE NOT COVERED BY ADDING BY COMPARING THEIR MINIMJUM COST ..
//ATA LST ADD ATHEIT COST AND RETURN..


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
//    int cost;
//    public Pair(int n,int c){
//        this.node=n;
//        this.cost=c;
//    }
//    @Override
//    public int compareTo(Pair p2) {
//        return this.cost - p2.cost;//ASCENDING..FOR DESCENDING ulta..
//    }
//}
//public class IV_MINNING_SPANNING_TREE {
//    public static void constructGraphs(ArrayList<Edge> graph[]) {
//        for (int i = 0; i < graph.length; i++) {
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0, 1, 10));
//        graph[0].add(new Edge(0, 2, 15));
//        graph[0].add(new Edge(0, 3, 30));
//        graph[1].add(new Edge(1, 0, 10));
//        graph[1].add(new Edge(1, 3, 40));
//        graph[2].add(new Edge(2, 0, 15));
//        graph[2].add(new Edge(2, 3, 50));
//        graph[3].add(new Edge(3, 1, 40));
//        graph[3].add(new Edge(3, 2, 50));
//    }
//
//    private static void prim(ArrayList<Edge>[] graph, int V) {
//        PriorityQueue<Pair> pq = new PriorityQueue<>();
//        boolean vis[] = new boolean[V];
//        pq.add(new Pair(0,0));
//        int mstCost =0;
//
//        while (!pq.isEmpty()){
//            Pair curr = pq.remove();
//            if (!vis[curr.node]){
//                vis[curr.node]=true;
//                mstCost += curr.cost;
//
//                for (int i=0;i<graph[curr.node].size();i++){
//                    Edge e = graph[curr.node].get(i);
//                    if (!vis[e.dest]){
//                        pq.add(new Pair(e.dest,e.wght));
//                    }
//                }
//            }
//        }
//        System.out.println("Min cost of mst = " + mstCost);
//    }
//
//    public static void main(String[] args) {
//        int V = 4;
//        ArrayList<Edge> graph[] = new ArrayList[V];
//        constructGraphs(graph);
//
//        prim(graph,V);
//    }
//
//
//}