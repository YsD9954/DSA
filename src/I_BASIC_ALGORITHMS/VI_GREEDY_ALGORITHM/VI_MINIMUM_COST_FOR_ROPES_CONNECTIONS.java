package I_BASIC_ALGORITHMS.VI_GREEDY_ALGORITHM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class VI_MINIMUM_COST_FOR_ROPES_CONNECTIONS {
    public static void main(String[] args) {
//        Integer arr[] = {4, 3, 2, 6};  //note int nha Integer liknha padta hai!!
//        ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(arr));
//        int cost=0;
//
//        // code here
//        while(arraylist.size()!=1){ //jab tak 2 ropes hai tab tak add akr sakte haio if ek hi ropes hai toh stop!!!
//            Collections.sort(arraylist);
//            cost += arraylist.get(0)+arraylist.get(1);
////            System.out.println(cost);
//            arraylist.add(arraylist.get(0)+arraylist.get(1)); //cost me final cost hai muzhe iusko add karna hai not final cost
////            System.out.println(arraylist);
//
//            arraylist.remove(0);
//            arraylist.remove(0); //mene pahile 0 index ko nikala toh mera jo 1 indextha vho 0 pe aay atoh firse meko 0 indexko hi nikalana hai!!!
//        }
//
//        System.out.println(cost);


//        vaisesahi hai logic but more optimize and jab bhi sorted updation karna hai tabh priority queue (MINHEAP)!!! hi use karneka amjha!!easy hoga!!



        Integer arr[] = {4, 3, 2, 6};  //note int nha Integer liknha padta hai!!
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : arr) {
            pq.add(val);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int first = pq.poll();  // smallest
            int second = pq.poll(); // second smallest
            int sum = first + second;
            cost += sum;
            pq.add(sum);
        }
        System.out.println(cost);

    }
}


//Note=>
//simple hai...
//{4, 3, 2, 6} => {2 ,3 ,4, 6} => {5 ,4, 6} => {4 ,5 ,6} =>{9 ,6} => {6 ,9} => {15} =>stop!!!
// cost =            5                      +  9                  + 15
//cost = 29!!



//BAKI YADDDDD RKHAN PRIPRITY QUEUE (minHEAP)HI USKARNA ZHANZHAT NHI HOGI!!!


