class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int x : nums)
            ans ^= x;      // Duplicates cancel out a^a=0

        return ans;
    }
}