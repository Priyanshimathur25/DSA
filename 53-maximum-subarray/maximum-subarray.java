class Solution {
    public int maxSubArray(int[] nums) {

        int curr_sum = nums[0];
        int max_sum = nums[0];

        for (int j = 1; j < nums.length; j++) {

            curr_sum = Math.max(nums[j], curr_sum + nums[j]);

            max_sum = Math.max(max_sum, curr_sum);
        }

        return max_sum;
    }
}