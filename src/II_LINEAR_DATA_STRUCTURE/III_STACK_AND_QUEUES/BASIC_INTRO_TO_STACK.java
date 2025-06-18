//DEKHO ...AS WE KNOW HUM BASIC IMPLEMENTATION PADH RAHE HAI BECAUSE MUZHE UNDER KYA CHaAL RAHA HAI VHO JANNA HAI ..BUT HAUM PLACEMENTS KE LIYE  DEFALUT STACKK HI USE KARENGE ..!!

//                                                                STACK IMPLEMENTATION:-
//1.ARRAY->BAHUT JHANJHAT BAHI...:(  ...AREE APNA ARRAY KA SIZE KA ISSUE HO JAYEGA BUT STACK TOH KITNA BHI BADA HO KATA HAI SO PROBLEM AAYEGA IMPLEMENTATION ME...
//2. ARRAYLIST.. => NO SIZE IOSSSUE AND DIORECT METHOD USE KARENGE..
//3.LINKEDLIST => AGAIN NO SIZE ISSUE ADN LL ABHI TOH AATI HAI BHAI ..RIGHT?..

//                                                    ARRAY==>
//
//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//class MyStack{
//    static int size;
//    static int top=-1;
//    static int arr[];
//
//
//    public MyStack(int size){
//        this.size=size;
//        this.arr = new int[size];
//
//    }
//
//    public static boolean isEmpty(){
//        return top==-1;
//    }
//    public boolean isFull() {
//        return top == size - 1;
//    }
//    public void push(int data){
//        top++;
//        arr[top]=data;
//
//    }
//    public  int pop(){
//        if (isEmpty()){
//            return -1;
//        }
//        int res=arr[top];
//        top--;
//        return res;
//    }
//
//
//}
//
//public class BASIC_INTRO_TO_STACK {
//    public static void main(String[] args) {
//        MyStack s = new MyStack(5);
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//
//        System.out.println(s.pop());
//    }
//}



//BUT AS WE SEEN BAHUT FALTU GIRI HAI FOR ARRAY IMPLEMENTATION SO WE ARE NOW IMPLENMET THROUGH LINKEDLIST AND ARRAYLIST....


//
////                                                    LINKEDLIST=>
//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//class Node{
//    int data;
//    Node next;
//    public Node(int data){
//        this.data= data;
//        this.next=null;
//    }
//}
//
//class MyStack{
//    static Node head; //hume stack me head nhi dete parameter me isliye  direct bahar rakh diya...
//    public static boolean isEmpty(){
//        return head==null;
//    }
//    public static void push(int data){
//        Node temp = new Node(data);
//        if (isEmpty()){
//            head=temp;
//            return;
//        }
//        temp.next=head;
//        head=temp;
//    }
//
//    public static int pop(){
//        if (isEmpty()){
//            return -1;
//        }
//        int top = head.data;
//        head=head.next;
//        return top;
//    }
//
//    public static int peek() {
//        if (isEmpty()){
//            return -1;
//        }
//        return head.data;
//
//    }
//
//}
//
//public class BASIC_INTRO_TO_STACK {
//    public static void main(String[] args) {
//        MyStack s = new MyStack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//
//
//
//
//    }
//}




                                                        //ARRAYLIST==>

//
//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//
//import java.util.ArrayList;
//
//class MyStack{
//    static ArrayList <Integer> list = new ArrayList<>();
//
//    public static boolean isEmpty(){
//        return list.size()==0;
//    }
//    public static void push(int data){
//        list.add(data);
//    }
//    public static int pop(){
//        if (isEmpty()){
//            return -1;
//        }
//        int top=list.get(list.size()-1);//muzhe value chaye ...
//        list.remove(list.size()-1);//usko remove kar na hai toh index se bhi kar sakte hai..
//        return top;
//    }
//
//    public static int peek() {
//        if (isEmpty()){
//            return -1;
//        }
//        int top=list.get(list.size()-1);//muzhe value chaye ...
//        return top;
//    }
//
//}
//
//public class BASIC_INTRO_TO_STACK {
//    public static void main(String[] args) {
//        MyStack s = new MyStack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//        s.push(5);
//
//        while (!s.isEmpty()){
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}
