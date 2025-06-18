//package I_LINEAR_DATA_STRUCTURE.III_STACK_AND_QUEUES;
//
//
//class MyStack{
//    static int size;
//    static int top1=-1;
//    static int top2=size;
//    static int arr[];
//
//
//    public MyStack(int size){ //SABSE IMP HAI CONSTRUCTOR ..OKK..BAKI TOH KUCH ITNA NHI...
//        this.size=size;
//        this.arr = new int[size];
//        top1 = -1;
//        top2 = size;
//    }
//
//
//    public void push1(int data){
//        if ((top1+1)==top2){
//            System.out.println("Stack 1 Overflow");
//            return;
//        }
//        top1++;
//        arr[top1]=data;
//
//    }
//    public void push2(int data){
//        if (top2 - 1 == top1) {
//            System.out.println("Stack 2 overflow!");
//            return;
//        }
//        top2--;
//        arr[top2]=data;
//
//    }
//    public  int pop1(){
//        if (top1 == -1) {
//            System.out.println("Stack 1 underflow!");
//            return -1;
//        }
//        int res=arr[top1];
//        top1--;
//        return res;
//    }
//
//    public  int pop2(){
//        if (top2 == size) {
//            System.out.println("Stack 2 underflow!");
//            return -1;
//        }
//        int res=arr[top2];
//        top2++;
//        return res;
//    }
//
//}
//
//public class I_TWO_STACKS_IN_AN_ARRAY {
//    public static void main(String[] args) {
//        MyStack s = new MyStack(5);
//        s.push1(1);
//        s.push1(2);
//        s.push2(3);
//        s.push2(4);
//
//        System.out.println(s.pop1());
//        System.out.println(s.pop2());
//
//    }
//}
