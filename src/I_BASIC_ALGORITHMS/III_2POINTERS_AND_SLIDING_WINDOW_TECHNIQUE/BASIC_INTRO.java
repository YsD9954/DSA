package I_BASIC_ALGORITHMS.III_2POINTERS_AND_SLIDING_WINDOW_TECHNIQUE;

//Two Pointers: Move two indices in a 1D structure (usually arrays/strings) to find pairs/ranges efficiently—classic for sorted arrays, partitioning, deduping, etc.
//Sliding Window: A specialized two-pointer pattern for contiguous subarrays/substrings where you expand/contract a window while maintaining a condition



//🌟TYPE1 PROBLEM
//1. CONSTANT WINDOW
//
//We’re solving a constant window size problem:
//👉 Example array:arr = [1, 2, 3, 3, 4, 5, -1]
//👉 Window size: k = 4
//👉 Goal: Find the maximum sum of any contiguous subarray of size k.
//
//        🔹 Step 1: Initialization
//        We first calculate the sum of the first window (first k elements):
//        sum = arr[0] + arr[1] + arr[2] + arr[3]
//        = 1 + 2 + 3 + 3
//        = 9
//        But in the screenshot, he wrote sum = 7 because maybe he chose a slightly different window (check numbers [2,3,3,-1] → sum = 7). Anyway, idea is the same.
//        Also initialize:
//        l = 0               // left index of window
//        r = k - 1 = 3       // right index of window
//        maxSum = sum        // current maximum
//
//        🔹 Step 2: Sliding the Window
//        Now we slide the window forward by one step each time until the end of array:
//        General formula:
//        sum = sum - arr[l] + arr[r+1]
//        l++
//        r++
//        This works because: sum - arr[l] → removes the leftmost element (which is leaving the window).+ arr[r+1] → adds the new right element (which is entering the window).
//        At each step, update:
//        maxSum = max(maxSum, sum)
//
//        🔹 Step 3: Example Walkthrough
//        Array: [1, 2, 3, 3, 4, 5, -1], k = 4
//        First window [1,2,3,3]
//        sum = 9, maxSum = 9
//        Slide → [2,3,3,4]
//        sum = 9 - 1 + 4 = 12, maxSum = 12
//        Slide → [3,3,4,5]
//        sum = 12 - 2 + 5 = 15, maxSum = 15
//        Slide → [3,4,5,-1]
//        sum = 15 - 3 + (-1) = 11, maxSum = 15
//        ✅ Answer = 15
//
//        🔹 Step 4: Pseudocode
//        int n = arr.length;
//        int k = 4;
//        int sum = 0;
//// initial sum of first window
//        for (int i = 0; i < k; i++) {
//        sum += arr[i];
//        }
//        int maxSum = sum;
//
//        int l = 0, r = k-1;
//
//        while (r < n-1) {
//        sum = sum - arr[l];  // remove leftmost
//        l++;
//        r++;
//        sum = sum + arr[r];  // add new rightmost
//
//        maxSum = Math.max(maxSum, sum);
//        }
//
//        System.out.println(maxSum);


//🌟TYPE2 PROBLEM ...VVVIMP!!
//LONGEST SUBARRAY/SUBSTRING WHERE <CONDITION>

//subarray -> always contigious
//ASSUME WE HAVE arr = [2, 5, 1, 7, 10] & K = 14
//        We need the longest subarray such that:- sum(subarray) ≤ K
//
//-----------------------------BRUTEFORCE APPROCH=>Time complexity = O(n²)------------------------------------
//
//        The idea is to generate all subarrays and check their sums.
//
//        *Step 1: Generate all subarrays
//        We use two loops:
//        Outer loop → starting index i
//        Inner loop → ending index j (starting from i to n-1)
//        So every (i, j) pair defines a subarray:
//        arr[i], arr[i+1], ..., arr[j]
//
//        *Step 2: Compute sum of each subarray
//        For each subarray (i → j) we compute:
//        sum = arr[i] + arr[i+1] + ... + arr[j]
//        Check:
//        if sum ≤ K:
//        update maxLength = max(maxLength, j-i+1)
//
//        *Step 3: Dry Run Example
//        arr = [2, 5, 1, 7, 10], K = 14
//        Subarray [2] → sum=2 ≤14 → len=1
//        Subarray [2,5] → sum=7 ≤14 → len=2
//        Subarray [2,5,1] → sum=8 ≤14 → len=3
//        Subarray [2,5,1,7] → sum=15 >14 (stop for this j)
//        Subarray [5] → sum=5 ≤14 → len=1
//        Subarray [5,1] → sum=6 ≤14 → len=2
//        Subarray [5,1,7] → sum=13 ≤14 → len=3
//        Subarray [5,1,7,10] → sum=23 >14
//        Subarray [1] → sum=1 ≤14 → len=1
//        Subarray [1,7] → sum=8 ≤14 → len=2
//        Subarray [1,7,10] → sum=18 >14
//        Subarray [7] → sum=7 ≤14 → len=1
//        Subarray [7,10] → sum=17 >14
//        Subarray [10] → sum=10 ≤14 → len=1
//
//        ✅ The longest valid subarrays are [2,5,1] and [5,1,7] → both length = 3
//        So answer = 3
//
//        *Step 4: Brute Force Code (Java-style)
//        int n = arr.length;
//        int K = 14;
//        int maxLen = 0;
//
//        for (int i = 0; i < n; i++) {
//        int sum = 0;
//        for (int j = i; j < n; j++) {
//        sum += arr[j];   // sum of subarray i..j
//        if (sum <= K) {
//        maxLen = Math.max(maxLen, j - i + 1);
//        }
//        }
//        }
//
//        System.out.println(maxLen);
//
//
//
//
//---------------Better Sliding Window (Variable Window) approach=>Time complexity = O(2n)------------------
//
//🔹 Initialization
//arr = [2, 5, 1, 10, 10], K = 14
//
//l = 0          // left pointer
//r = 0          // right pointer
//sum = 0        // current window sum
//maxLen = 0     // longest subarray length
//
//🔹 Algorithm
//Outer loop: expand window with r
//
//while (r < n):
//    sum = sum + arr[r]
//
//
//Inner loop: shrink window if invalid
//
//while (sum > K):
//    sum = sum - arr[l]
//    l = l + 1
//
//
//👉 This ensures that the current window [l..r] always has sum ≤ K.
//
//Check window length
//
//if (sum ≤ K):
//    maxLen = max(maxLen, r - l + 1)
//
//
//Move right pointer
//
//r = r + 1
//
//🔹 Dry Run Example
//arr = [2, 5, 1, 10, 10], K = 14
//
//
//r=0 → window [2]
//sum=2 ≤14 → len=1 → maxLen=1
//
//r=1 → window [2,5]
//sum=7 ≤14 → len=2 → maxLen=2
//
//r=2 → window [2,5,1]
//sum=8 ≤14 → len=3 → maxLen=3
//
//r=3 → window [2,5,1,10]
//sum=18 >14 → shrink:
//
//remove arr[l]=2 → sum=16, l=1
//
//remove arr[l]=5 → sum=11, l=2
//now window [1,10] sum=11 ≤14 → len=2 → maxLen=3
//
//r=4 → window [1,10,10]
//sum=21 >14 → shrink:
//
//remove arr[l]=1 → sum=20, l=3
//
//remove arr[l]=10 → sum=10, l=4
//window [10] sum=10 ≤14 → len=1 → maxLen=3
//
//✅ Answer = 3
//
//
//
//
//---------------Optimized Sliding Window (Variable Window) approach=>Time complexity = O(n)------------------
//
// just removed inner while loop an djust checking instead of that while loop!
//Outer loop: expand window with r
//
//while (r < n):
//    sum = sum + arr[r]
//
//
//Inner if condition: shrink window if invalid
//
//if (sum > K):
//    sum = sum - arr[l]
//    l = l + 1
//
//
//👉 This ensures that the current window [l..r] always has sum ≤ K.
//
//arr = [2, 5, 1, 10, 10], K = 14
//
//l = 0          // left pointer
//r = 0          // right pointer
//sum = 0        // current window sum
//maxLen = 0     // longest subarray length
//
//So, Algorithm is very similar....
//Outer loop: expand window with r
//
//while (r < n):
//    sum = sum + arr[r]
//
//
//Inner loop: shrink window if invalid
//
//while (sum > K):
//    sum = sum - arr[l]
//    l = l + 1
//
//
//👉 This ensures that the current window [l..r] always has sum ≤ K.
//
//Check window length
//
//if (sum ≤ K):
//    maxLen = max(maxLen, r - l + 1)
//
//
//Move right pointer
//
//r = r + 1
//



//🌟TYPE3 PROBLEM
//---------------------------NO. OF SUBARRAY WHERE<CONDITION>
//NO. OF SUBARRAY WHERE sum=k...
//SO STEP1-> find No. of subarrays where (sum<=k)
//STEP2 -> No. of subarrays where (sum<=k-1)




//🌟TYPE4 PROBLEM
//Shortest / Minimum Window

//You expand the window (by moving right pointer r) until the condition is satisfied (valid window).
//Then, you shrink from the left (move l) to minimize the window while still keeping it valid.
//Keep track of the smallest valid window length.


//👉 So in summary:
//Longest Window → expand, shrink only if invalid.
//Shortest / Minimum Window → expand until valid, then shrink while still valid.



//______________________________________________________________|
//IN CONCLUSION ..WE CAN IDENTIFY THE PROBLEM LIKE...==>        |
//  1. IS IT ARRAY OR STRING QUESTION?                          |
//  2. ARE THEY ASKING FOR SUBARRAY OR SUBSTRING?              |
//  3. IS FIXED WINDOW OR VARIABLE WINDOW REQUIRED?             |
//--------------------------------------------------------------|









