//GREEDY ALGO ...ASAAAAAAAANNNNNNNNNN HAI!!!!!!!!!


//KUCH NAYA NHAI HAIO BAHI VAHI REPEATATIVLEY KARNA HAI! ..PROVIDED YOU HAVE DONE ~100 QUESTIONS ATLEAST!!

//BUT MINDSET LALCHI(GREEDY) RAKHNA HAI!!!



//FOR FEEELING

//MUZHE MUMBAI->DELHI JANA HAI SO..
//WAY 1=> WALKING
//WAY2 => BIKE
//WAY3 => CAR
//WAY4 => TRAIN
//WAY5 => FLIGHT

//
//NOW IF THEY ADD CONDn LIKE I NEED TO REACH IN 12 HRS..
//
//SO THIS IS CONSTRAINT!!!!!!!!!!!!!!!!
//SO WE NEED TO HAVE FEIASABLE SOLUTION!!
//NOW HERE FEIASABLE SOLUTION ARE=> ---WAY4 => TRAIN & WAY5 => FLIGHT---
//SO FOR ONE PROBLEM THERE MAY BE MULTIPLE "" FEIASABLE"" SOLUTION!!


//NOW AGAIN HUM TOH HAI BHIKARI ...SO THERE IS AGAIN WE NEED MIN TRAVEL EXPENSES!!]
//SO FOR THAT WE NEED OPTIMIZED SOLUTION SO THAT IS=> ----WAY4 => TRAIN--- ! ONLY!!!!!!!!
//SO FOR PARTICULAR SOLUTION THERE IS ONY ONE ""OPTIMIZED"" SOLUTION ..


//SO FOR A PROBLEM WE ARE ASKED FOR OPTIMIZED SOUTLION THAT PROBLEM IS ...
//OPTIMIZATION PROBLEM AND OPTIMIZATION PROBELMS ARE SOLVED BY GREEDY ALGO

//NOTE=> WE CAN HAVE ANOTHER WAYS TO SOLVE OPTIMZATION PROBLEMS.. LIKE WE DID USING DP!!






//THIS ONE FOR EXTRA EFFORTS ......................KAM AAYEGA BIDU.....

//
//✅ Ways to Sort a 2D Array
//        1. Sort by first column (start time)
//        Arrays.sort(activity, (a, b) -> a[0] - b[0]);
//        2. Sort by second column (end time)
//        Arrays.sort(activity, (a, b) -> a[1] - b[1]);
//        3. Sort by difference (end - start)
//        Arrays.sort(activity, (a, b) -> (a[1] - a[0]) - (b[1] - b[0]));
//        4. Sort by sum of elements in each row
//        Arrays.sort(activity, (a, b) -> (a[0] + a[1]) - (b[0] + b[1]));
//        5. Sort in descending order (e.g., end time descending)
//        Arrays.sort(activity, (a, b) -> b[1] - a[1]);
//        📌 Using Comparator.comparingInt (Optional, Java 8+ clean code)
//        Sort by end time:
//        Arrays.sort(activity, Comparator.comparingInt(a -> a[1]));
//        Sort by start time:
//        Arrays.sort(activity, Comparator.comparingInt(a -> a[0]));
//
//
//       ************************ 📌 Important Notes*******************************
//        a[1] - b[1] works because the arrays are small (2 columns). For larger arrays or more complex criteria, write a full comparator.
//
//        Beware of overflow: Use Integer.compare(a[1], b[1]) instead of a[1] - b[1] if values can be large.
//
//
//
//
//
//
//
// SO BASIC CONCEPT IS ..
//LET'S TAKE A SEXXPAMPLE AND SEE..
//int[][] activity = {
//    {1, 3},
//    {2, 1},
//    {4, 5}
//};

// Suppose these rows are being compared:
// SO 1ST AND 2ND ROW.. AND CONTIUE..
//a = {1, 3}
//b = {2, 1}
//return a[1] - b[1]; // i.e., 3 - 1 = 2 => means a > b


