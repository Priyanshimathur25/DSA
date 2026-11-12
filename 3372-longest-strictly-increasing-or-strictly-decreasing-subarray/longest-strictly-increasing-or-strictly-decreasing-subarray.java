class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int inc = 1;
        int dec = 1;
        int max_val = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                dec += 1;
                inc = 1;
            } else if (nums[i] > nums[i - 1]) {
                inc += 1;
                dec = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            max_val = Math.max(max_val, Math.max(inc, dec));
        }
        return max_val;
    }
}
