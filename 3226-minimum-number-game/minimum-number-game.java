class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int i = 0;
        while (i < nums.length) {
            arr[i] = nums[i + 1];
            arr[i + 1] = nums[i];
            i = i + 2;
        }      
        return arr;
    }
}
