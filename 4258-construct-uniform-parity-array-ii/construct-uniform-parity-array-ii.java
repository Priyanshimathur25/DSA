class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];

        for (int n : nums1) {
            min = Math.min(min, n);
        }

        if (min % 2 == 1) {
            return true;
        }

        for (int n : nums1) {
            if (n % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}