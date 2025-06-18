//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//
////QUEUE??=>A INTERFACE!!!!!!!!!!!!!!!!!!
////IMPLEMENTIONS=>
////1.ARRAY=>TIME AND SIZE KA ISSUE HAI...
////2.LINKEDLIST=>BEST!!!
////3 BY DEEAFULT => COLLECTION FRAMEWORK...=> LINKEDLIST | ARRAYDEQUE!!! se implement karoge ...as QUEUE INTERFACE HAI!!!
//
////ARRAY==>
////class MyQueue{
////    static int arr[];
////    static int size;
////    static int rear;
//////    i want first size other wise array se kar nhi payenge...
////
////    MyQueue(int n){
////        arr=new int[n];
////        this.size=n;
////        rear=-1;
////
////    }
////    public static boolean isEmpty(){
////        return rear==-1;
////    }
////    public static boolean isFull(){
////        return rear==size-1;
////    }
////    public static void add(int data){//enque!!!
////        if (isFull()){
////            System.out.println("Overflow");
////            return;
////        }
////        rear++;
////        arr[rear]=data;
////    }
////    public static int remove(){
////        if (isEmpty()){
////            return -1;
////        }
////        int front = arr[0];
////        for (int i=0;i<rear;i++){
////            arr[i]=arr[i+1];
////        }
////        rear--;
////        return front;
////    }
////
////    public static int peek(){
////        if (isEmpty()){
////            System.out.println("Empty Queue");
////            return -1;
////        }
////        int front=arr[0];
////        return front;
////
////
////    }
////
////}
////public class BASIC_INTRO_TO_QUEUE {
////    public static void main(String[] args) {
////        MyQueue q = new MyQueue(5);
////        q.add(1);
////        q.add(2);
////        q.add(3);
////        q.add(4);
////        q.add(5);
////
////        while (!q.isEmpty()){
////            System.out.println(q.peek());
////            q.remove();
////        }
////
////
////    }
////}
////
//
////II. LINKEDLIST
////
////
////class Node{
////    int data;
////    Node next;
////
////    public Node(int data){
////        this.data=data;
////        next=null;
////
////    }
////}
////class MyQueue{
////    static Node head = null;
////    static Node tail = null;
//////    *****      i don't want size ...   *****
////
////
////
////    public static boolean isEmpty(){
////        return head==null && tail==null;
////    }
////    public static void add(int data){//enque!!!
////        Node newNode = new Node(data);
////
////        if (isEmpty()){
////            head=tail=newNode;
////            return;
////        }
////        tail.next=newNode;
////        tail=newNode;
////
////    }
////    public static int remove(){
////        if (isEmpty()){
////            return -1;
////        }
////        int front = head.data;
////
////        if (head==tail){
////            tail=null;
////        }
////        head = head.next;
////        return front;
////    }
////
////    public static int peek(){
////        if (isEmpty()){
////            return -1;
////        }
////        return head.data;
////    }
////}
////public class BASIC_INTRO_TO_QUEUE {
////    public static void main(String[] args) {
////        MyQueue q = new MyQueue();//NO need of size for LL!!
////        q.add(1);
////        q.add(2);
////        q.add(3);
////        q.add(4);
////        q.add(5);
////
////        while (!q.isEmpty()){
////            System.out.println(q.peek());
////            q.remove();
////        }
////
////
////    }
////}
//
//
//
////
//////CIORCULAR LL USING ARRAYYYYYYYYYYYYYYYYYYYYY!!!!!!!!!!
////
////
////class MyQueue{
////    static int arr[];
////    static int size;
////    static int rear;
////    static int front;
////
//////    i want first size other wise array se kar nhi payenge...
////
////    MyQueue(int n){
////        arr=new int[n];
////        this.size=n;
////        rear=-1;
////        front=-1;
////    }
////
////
////
////    public static boolean isEmpty(){
////        return rear==-1 && front==-1;
////    }
////    public static boolean isFull(){
////        return (rear+1)%size==front;
////    }
////    public static void add(int data){//enque!!!
////        if (isFull()){
////            System.out.println("Overflow");
////            return;
////        }
////        if (front==-1){
////            front=0;
////        }
////        rear=(rear+1)%size;
////        arr[rear]=data;
////    }
////    public static int remove(){
////        if (isEmpty()){
////            return -1;
////        }
////        int res = arr[front];
////        if (front==rear){
////            front=rear=-1;
////        }
////        else {
////            front=(front+1)%size;
////        }
////        return res;
////    }
////
////    public static int peek(){
////        if (isEmpty()){
////            System.out.println("Empty Queue");
////            return -1;
////        }
////        return arr[front];
////
////
////    }
////
////}
////public class BASIC_INTRO_TO_QUEUE {
////    public static void main(String[] args) {
////        MyQueue q = new MyQueue(5);
////        q.add(1);
////        q.add(2);
////        q.add(3);
////        q.add(4);
////        q.add(5);
////        System.out.println(q.remove());
////        q.add(6);
////        System.out.println(q.remove());
////        q.add(7);
////        while (!q.isEmpty()){
////            System.out.println(q.peek());
////            q.remove();
////        }
////
////
////
////
////    }
////}
//
//
//
//
//
//
//
////BUT HUM TOH DIRECT DEFALUT USE KARENGE..
//
//
//import java.util.ArrayDeque;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class BASIC_INTRO_TO_QUEUE {
//    public static void main(String[] args) {
////        Queue<Integer> q = new LinkedList<>();
////                        or
//        Queue<Integer> q = new ArrayDeque<>();
//
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//
//
//        while(!q.isEmpty()) {
//            System.out.println(q.peek());
//            q.remove();
//        }
//
//    }
//}