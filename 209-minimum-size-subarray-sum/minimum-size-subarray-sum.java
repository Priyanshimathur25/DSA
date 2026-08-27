class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minlen = Integer.MAX_VALUE;
        int l = 0;
        int curr_sum = 0;

        for (int i = 0; i < nums.length; i++) {

            curr_sum += nums[i];

            while (curr_sum >= target) {

                minlen = Math.min(minlen, i - l + 1);

                curr_sum -= nums[l];
                l++;
            }
        }

        return (minlen == Integer.MAX_VALUE) ? 0 : minlen;
    }
}