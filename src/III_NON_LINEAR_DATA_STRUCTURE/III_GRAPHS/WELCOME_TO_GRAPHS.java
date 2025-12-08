//
//NETWORK OF NODES..
//NODE=VERTEX AND CONNECTION = EDGE
//
//SO WHAT IS DIFFENRCE BETWEEN TREES AND GRAPHS????
//TREESS-> HEIRARICHAL AND NO CYCLES....
//GRAPHS-> NO NEED OF HEIRARCHY AND CAN HAVE CYCLES
//
//VERRRR..YYYYYY.. IMP DS FOR PLACEMENT
//
//APPLICATION?
//1.MAPS->ex-GOOGLE MAPS!!
//2. SOCIAL NETWORK-> ex-INSTA!!
//3. DELIVERY NETWORK-> ex-SWIGGY,ZOMATO!!!
//
//
// EDGES=>
// 1.UNI-DIRECTIONAL !! -> EK HI WAY ==> FORMS DIRECTED GRAPHS
// 2.BI-DIRECTIONAL / UNDIRECTIONAL - KIDHER BHI JA SAK TA HAI !!!==> FORMS UNDIRECTED GRAPHS
// 3.WEIGHTED -> SOME VALUE OF WEIGHTS { IT MAY BE TIME ,DISTANCE etc}
// 4.UN-WEIGHTED -> WITHOUT WEIGHTS!!
//
// ----------------------------------------------------------------------------------
//                                     ||
//                                     \/
//  WE CAN DIRECTLY FIGURE OUT IT IS DIRECTED WEIGHTED OR DIRECTED UNWEIGHTED!!!
//
//
//SIMILAR TO BT,BST HUM GRAPHS KO BHI IMPLEMENT KAR SAKTE HAI BY ISNIGN NODE  CLASS AND......
//
//
//
// CREATING A GRAPHS==>
// 1.ADJACENCY LIST => BEST FOR TIME AND SPACE AS JITNE neighbours HAI UTNE HI BANENEGE..
// 2.ADJACENCY MATRIX => TIME AND SPACE IF AS JITNA size HAI PURA LAGEGA... SO NON NEIGHBOURS BHI ...
// 3.EDGE LIST => BEST FOR SORTING .. ARRAYLIST OF LIST...
// 4.2D MATRIX (IMPLICIT GRAPH) =>  2D ARRRAY KO HUM LIST JAISE IMAGINE KARTE HAI...=>BEST FOR FLOOD FILL
//
//WE WILL IMPLEMENT ONLY ADJACENCY LIST METHOD AS VHI JYADA USE KARENGE..
//
//
//
// 1.ADJACENCY LIST
//AS WE HAVE UNIDIRECTIONL OR UNDIRECTIONAL OR WEIGHTED OR UNWEIGHTED..
//SO....... WE CONSIDER...UNDIRECTIONAL AND WEIGHTED...
//
//
//
package III_NON_LINEAR_DATA_STRUCTURE.III_GRAPHS;

import java.util.ArrayList;

class Edge{
    int src;
    int dest;
    int wegt;
    Edge(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.wegt=w;
    }
}
public class WELCOME_TO_GRAPHS {
    static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
//        print all dest and weight of particular index
        for (int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest+","+e.wegt);
        }
    }
}

//
//2. ADJACENCY MATRIX
//FOR UNWEIGHTED...
//
// EX- 4 EDGES..
//    |---|---|
//0<->2<->3<->1
//|---|-------|
//
//soooo....
//MATRIX WILL BE....
//   |0   1   2   3
//---|-------------
//0  |0   0   1   0
//1  |0   0   1   1
//2  |1   1   0   1
//3  |0   1   1   0
//
//if i->j edge hai ....TOH
//graph[i][j]=1
//else-> 0
//
//
//
//FOR WEIGHTED....
//
//    |-5--|--4-|
//0<->2<->3<->1
//|-2-|--(-1)-|
//
//soooo....
//MATRIX WILL BE....
//   |0   1   2   3
//___|_____________
//0  |0   0   2   0
//1  |0   0  -1   4
//2  |2  -1   0   5
//3  |0   4   5   0
//
//
//if i->j edge hai ....TOH
//graph[i][j]=WEIGHT!! OR [j][i]    ......per bhi kr sakte hai...
//else-> 0
//
//
//IMPLEMENT QUESTION JAB AAYEGA TAB Karenge................
//
//
//