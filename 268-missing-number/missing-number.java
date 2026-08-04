class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int t = n*(n+1)/2;
        int n1=0;
        for(int i=0;i<n;i++){
            n1 = n1 + nums[i];
        }
        return t-n1;
    }
}