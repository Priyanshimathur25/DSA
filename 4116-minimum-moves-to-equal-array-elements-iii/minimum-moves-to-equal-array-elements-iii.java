class Solution {
    public int minMoves(int[] nums) {
    int target=0;
    int max=0;
    int sum=0;
    int ans=0;
    int n=nums.length;
    for(int i =0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
        sum+=nums[i];
    }
    
    target =max;
    ans=(n*max)-sum;
    return ans;
    }
}