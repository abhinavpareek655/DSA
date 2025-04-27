class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0, j=0;
        int sum = 0;
        int len = n;
        while(j<n){
            sum+=nums[j++];
            if(sum<target && i==0 && j==n) return 0;
            // System.out.println(sum);
            while(sum>=target){
                len = Math.min(len, j-i);
                sum-=nums[i++];
            }
            // System.out.println(i+","+j);
            // System.out.println(sum);
        }
        return len;
    }
}