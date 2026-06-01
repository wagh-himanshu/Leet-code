import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate negative and non-negative numbers
        for (int num : nums) {
            if (num < 0) {
                neg.add(num);
            } else {
                pos.add(num);
            }
        }

        // Square negatives and reverse
        for (int i = 0; i < neg.size(); i++) {
            neg.set(i, neg.get(i) * neg.get(i));
        }
        Collections.reverse(neg);

        // Square positives
        for (int i = 0; i < pos.size(); i++) {
            pos.set(i, pos.get(i) * pos.get(i));
        }

        int n1 = neg.size();
        int n2 = pos.size();

        int[] res = new int[n1 + n2];

        int i = 0, j = 0, idx = 0;

        // Merge two sorted lists
        while (i < n1 && j < n2) {
            if (neg.get(i) <= pos.get(j)) {
                res[idx++] = neg.get(i++);
            } else {
                res[idx++] = pos.get(j++);
            }
        }

        while (i < n1) {
            res[idx++] = neg.get(i++);
        }

        while (j < n2) {
            res[idx++] = pos.get(j++);
        }

        return res;
    }
}

// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n = nums.length;
//         int[] res = new int[n];

//         int left = 0;
//         int right = n - 1;
//         int idx = n - 1;

//         while (left <= right) {
//             int leftSq = nums[left] * nums[left];
//             int rightSq = nums[right] * nums[right];

//             if (leftSq > rightSq) {
//                 res[idx--] = leftSq;
//                 left++;
//             } else {
//                 res[idx--] = rightSq;
//                 right--;
//             }
//         }

//         return res;
//     }
// }