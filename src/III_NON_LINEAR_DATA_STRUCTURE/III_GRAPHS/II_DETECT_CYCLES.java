

//FOR DIRECTED!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!





//package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;
//import java.util.ArrayList;
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
//public class II_DETECT_CYCLES {
//    public static void  constructGraphs(ArrayList<Edge> graph[]){
//        for (int i=0;i<graph.length;i++){
//            graph[i]=new ArrayList<>();
//        }
//        graph[0].add(new Edge(0, 1, 1));
//        graph[0].add(new Edge(0, 2, 1));
//
//        graph[1].add(new Edge(1, 0, 1));
//        graph[1].add(new Edge(1, 3, 1));
//
//        graph[2].add(new Edge(2, 0, 1));
//        graph[2].add(new Edge(2, 4, 1));
//
//        graph[3].add(new Edge(3, 1, 1));
//        graph[3].add(new Edge(3, 4, 1));
//        graph[3].add(new Edge(3, 5, 1));
//
//        graph[4].add(new Edge(4, 2, 1));
//        graph[4].add(new Edge(4, 3, 1));
//        graph[4].add(new Edge(4, 5, 1));
//
//        graph[5].add(new Edge(5, 3, 1));
//        graph[5].add(new Edge(5, 4, 1));
//        graph[5].add(new Edge(5, 6, 1));
//        graph[5].add(new Edge(6, 5, 1));
//
//    }
//    public static boolean cycleDetection(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[]){
//        vis[curr] = true;
//        rec[curr] = true;
//        for (int i=0;i<graph[curr].size();i++){
//            Edge e = graph[curr].get(i);
//
//            if (rec[e.dest]){
//                return true;
//            }
//            else if (!vis[e.dest]){
//                if (cycleDetection(graph,vis,e.dest,rec)){
//                 return true;
//                }
//            }
//        }
//        rec[curr] = false;
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int v = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        constructGraphs(graph);
//        boolean vis[] = new boolean[v];
//        boolean rec[] = new boolean[v];
//
//        for(int i=0;i<v;i++){
//            if (!vis[i]){
//                boolean isCycle = cycleDetection(graph,vis,0,rec);
//                if (isCycle){
//                    System.out.println(isCycle);
//                    break;
//                }
//            }
//        }
//    }
//}






//FOR UNDIRECTED!!!!

//CHIDNI CODE HAI...
//CONDn 1 => IF VISTED IS TRUE AND PARENT NHI HA I THAT -> TRUE!!!!\
//CONDn 2 => IF VISITED TRUE AND PARENT HAI HAI THAT => FALSE HAI BUT DO NOTHING SO CODE ME DALO MAT AS KUCH NHI KARNA HAI HAMKO..
//CONDn 3 => IF VISITED NHI HAI SO CALL RECURSIVELTY AND IF THAT REURN TRUE=> YES RETURN TRUE!!

//
//package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;
//import java.util.ArrayList;
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
//public class II_DETECT_CYCLES {
//    public static void  constructGraphs(ArrayList<Edge> graph[]){
//        for (int i=0;i<graph.length;i++){
//            graph[i]=new ArrayList<>();
//        }
//        graph[0].add(new Edge(0, 1, 1));
//        graph[0].add(new Edge(0, 2, 1));
//
//        graph[1].add(new Edge(1, 0, 1));
//        graph[1].add(new Edge(1, 3, 1));
//
//        graph[2].add(new Edge(2, 0, 1));
//        graph[2].add(new Edge(2, 4, 1));
//
//        graph[3].add(new Edge(3, 1, 1));
//        graph[3].add(new Edge(3, 4, 1));
//        graph[3].add(new Edge(3, 5, 1));
//
//        graph[4].add(new Edge(4, 2, 1));
//        graph[4].add(new Edge(4, 3, 1));
//        graph[4].add(new Edge(4, 5, 1));
//
//        graph[5].add(new Edge(5, 3, 1));
//        graph[5].add(new Edge(5, 4, 1));
//        graph[5].add(new Edge(5, 6, 1));
//        graph[5].add(new Edge(6, 5, 1));
//
//    }
//    public static boolean cycleDetection(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
//        vis[curr] = true;
//        for (int i=0;i<graph[curr].size();i++){
//            Edge e = graph[curr].get(i);
//
//            if (vis[e.dest]==true && par !=e.dest){ //cond 1..
//                return true;
//            }
//            else if (!vis[e.dest]){
//                if (cycleDetection(graph,vis,e.dest,curr)==true){ //condn 3...
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int v = 7;
//        ArrayList<Edge> graph[] = new ArrayList[v];
//        constructGraphs(graph);
//        boolean vis[] = new boolean[v];
//        boolean rec[] = new boolean[v];
//
//
//        System.out.println(cycleDetection(graph,vis,0,-1));
//
//    }
//}




















