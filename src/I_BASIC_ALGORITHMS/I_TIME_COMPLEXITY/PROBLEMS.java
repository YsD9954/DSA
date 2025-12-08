//1.
//for(i=0;i<N;i++){
//    for(i=0;i<N;i++){
//
//    }
//}

//O(N²)

//2.
//for(i=0;i<N;i++){
//    for(i=0;i<i;i++){
//
//    }
//}

//O(N*I)


//3.
//int s=0,e=n-1;
//while(s<=e){
//    int mid=(s+(e-s)/2);
//     if(arr[mid]<target){
//      s=mid+1;
//    }
//      else if(arr[mid])>target){
//          e=mid-1;
//     }
//      else{
//        return mid;
//     }
//    }

//O(log(n))

//EXPLAIN:-

//see
//hereour array is decraeig form n ize to n/2 at each iteration..
//so firsrt
//n/2^0 -> n/2^1->n/2^2->.....-> 1..
//so...at last we will have power x...
//n/2^x=1
//n=2^x
//x=log(n) ...(base 2 hai islu=ye nhi likete!!)

//hense whenever you see we are decraisng by half our tc will always O(log(n))


