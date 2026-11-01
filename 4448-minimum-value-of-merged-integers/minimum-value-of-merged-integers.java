class Solution {
    public int minMergedInteger(int[] nums) {
        int min_element=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i+=2){
            int p=1;
            if(nums[i+1]<10){
                p=10;
            }else if(nums[i+1]<100){
                p=100;
            }else if(nums[i+1]<1000){
                p=1000;
            }else{
                p=10000;
            }
            min_element=Math.min(min_element,nums[i]*p+nums[i+1]);
        }
        return min_element;
    }
}