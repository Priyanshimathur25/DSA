class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int s = 0;
        int t = 1;

        int[] count = new int[nums.length];
        int c = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[s] == 1 && nums[t] == 1) {
                c++;
            } 
            else {
                c = 0;
            }

            count[i] = c;

            s++;
            t++;
        }

        int max = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }

        if (max == 0) {
            // There could be either no 1s OR exactly one 1.
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    return 1;
                }
            }
            return 0;
        }

        return max + 1;
    }
}