import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        int target = countDistinct(nums);
        int[] freq = new int[2001];
        int res = 0, distinct = 0;
        int left = 0, right = 0;

        for (; left < n; left++) {
            // expand right until window has all distinct values
            while (right < n && distinct < target) {
                if (freq[nums[right]]++ == 0) distinct++;
                right++;
            }
            // if we never reached full distinct set, break
            if (distinct < target) break;
            // every subarray [left..j) with j ≥ right is valid
            res += (n - right + 1);
            // shrink from left
            if (--freq[nums[left]] == 0) distinct--;
        }

        return res;
    }

    private int countDistinct(int[] nums) {
        boolean[] seen = new boolean[2001];
        int cnt = 0;
        for (int x : nums) {
            if (!seen[x]) {
                seen[x] = true;
                cnt++;
            }
        }
        return cnt;
    }
}
