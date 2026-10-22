class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int digitSum = 0;
            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;           
            }
            nums[i]=digitSum;
        }
         return Arrays.stream(nums).min().getAsInt();
    }
}