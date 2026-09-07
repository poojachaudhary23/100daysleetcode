class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        
        int start= 0;
        int end = n - 1;
        int ptr = n - 1;
        
        while (start <= end) {
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            
            if (ss > es) {
                ans[ptr] = ss;
                start++;
            } else {
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }
        return ans;
    }
}