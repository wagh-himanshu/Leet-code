import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // store nums1 elements
        for (int num : nums1) {
            set1.add(num);
        }

        // check common elements
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // convert set to array
        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}