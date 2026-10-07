import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // HashSet<Integer> set1 = new HashSet<>();
        // HashSet<Integer> result = new HashSet<>();

        // // store nums1 elements
        // for (int num : nums1) {
        //     set1.add(num);
        // }

        // // check common elements
        // for (int num : nums2) {
        //     if (set1.contains(num)) {
        //         result.add(num);
        //     }
        // }

        // // convert set to array
        // int[] ans = new int[result.size()];
        // int i = 0;

        // for (int num : result) {
        //     ans[i++] = num;
        // }

        // return ans;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int res[] = new int[list.size()];
        for(int k=0;k<list.size();k++){
            res[k] = list.get(k);
        }
        return res;
    }
}