package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;

import java.util.ArrayList;

class Edge{
    int src;
    int dept;
    int wegt;

    public Edge(int s,int d,int w){
        this.src=s;
        this.dept=d;
        this.wegt=w;
    }



}

public class II_NO_OF_ISLANDS {

    public static void constructGraph(ArrayList<Edge> graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[5].add(new Edge(6, 5, 1));

    }

    public static void main(String[] args) {

        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        constructGraph(graph);
    }
}
