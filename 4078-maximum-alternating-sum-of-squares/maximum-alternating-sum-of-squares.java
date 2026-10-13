class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long s1= Arrays.stream(nums,0,nums.length/2).asLongStream().sum();
        long s2= Arrays.stream(nums,nums.length/2,nums.length).asLongStream().sum();
        long res=s2-s1;
        return res;
    }
}