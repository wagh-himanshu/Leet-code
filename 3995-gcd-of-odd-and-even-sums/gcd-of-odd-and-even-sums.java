class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        
        // 1. Calculate the actual sums using the loops
        for (int i = 1; i <= n; i++) {
            sumOdd += (2 * i - 1); // Generates 1, 3, 5...
            sumEven += (2 * i);     // Generates 2, 4, 6...
        }
        
        // 2. Standard Euclidean algorithm for GCD
        while (sumEven != 0) {
            if(sumOdd > sumEven){
                sumOdd = sumOdd - sumEven;
            }else{
                sumEven = sumEven - sumOdd;
            }
        }
        
        return sumOdd; 
    }
}
