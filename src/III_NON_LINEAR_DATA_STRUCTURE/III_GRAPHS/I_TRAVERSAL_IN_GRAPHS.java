
//
////GRAPH TRAVERSAL .....
////
////JAISE BT AND BST ME PREORDER,INORDER,POSTORDER THA VAISE HI GRAPHS ME......
////
////
////1.BFS -> BREADTH FIRST SERACH -> QUEUE!!
////2.DFS -> DEAPTH FIRST SEARCH -> STACK!!
////
////
////NOTE HAMRE PASS IN GRAPH KOI ROOT NHI HAI..!!!:(
////SO KOI BHI NODE KO ROOT CONSIDER KARKE START KAR SAKTE HAI..
////
////
//
//
//package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Edge{
//    int src;
//    int dest;
//    int wght;
//
//    Edge(int s,int d,int w){
//        this.src = s;
//        this.dest=d;
//        this.wght=w;
//
//    }
//
//}
//public class I_TRAVERSAL_IN_GRAPHS {
//    public static void createGraph(ArrayList<Edge>[] graph) {
//        for (int i=0;i<graph.length;i++){
//            graph[i] = new ArrayList<>();
//        }
//
//        graph[0].add(new Edge(0,1,5));
//        graph[0].add(new Edge(0,2,3));
//
//        graph[0].add(new Edge(1,0,5));
//        graph[1].add(new Edge(1,2,1));
//        graph[1].add(new Edge(1,3,7));
//
//        graph[2].add(new Edge(2,0,3));
//        graph[2].add(new Edge(2,1,1));
//
//        graph[3].add(new Edge(3,1,7));
//    }
//
//
//    private static void bfs(ArrayList<Edge>[] graph, int v,boolean visited[],int start) {
//        Queue<Integer> q = new LinkedList<>();
//        q.add(start);
//        while (!q.isEmpty()){
//            int temp = q.remove();
//            if (visited[temp]==false){ // 0,1,2,3,4 aise hi aayenge temp ki values!
//                System.out.print(temp+" ");
//                visited[temp]=true;
//
//                for (int i=0;i<graph[temp].size();i++){ // like temp is 0 toh 0 ke sare links ko add karo q me!!
//                    Edge e = graph[temp].get(i);
//                    q.add(e.dest);
//
//                }
//            }
//        }
//        System.out.println();
//    }
//
//    private static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
//        System.out.print(curr+" ");
//        vis[curr] = true;
//
//        for (int i=0;i<graph[curr].size();i++){
//            Edge e = graph[curr].get(i);
//            if (vis[e.dest]==false){
//                dfs(graph,e.dest,vis);
//            }
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        int V = 4;
//        ArrayList<Edge> graph[] = new ArrayList[V];
//        createGraph(graph);
//
//
//        System.out.println("BFS->");
//        boolean visited[] =new boolean[V]; 
//        for (int i=0;i<V;i++){ //loop imp hai because some times koi nodes kisise bhi onnected nhi hai toh vho function se nhi pata halgea toh hum idher check krnge!!
//            if (visited[i]==false){
//                bfs(graph, V,visited,i);
//            }
//        }
//        System.out.println("DFS->");
//        boolean vis[] =new boolean[V];
//        for (int i=0;i<V;i++){
//            if (vis[i]==false){
//                dfs(graph,i,vis);
//            }
//        }
//        System.out.println();
//    }
//}
//
