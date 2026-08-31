class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int[] res=new int[nums.length];
        int pos=nums.length-1;
        while(l<=r){
            int lsqr=nums[l]*nums[l];
            int rsqr=nums[r]*nums[r];
            if(lsqr>rsqr){
                res[pos--]=lsqr;
                l++;
            }else{
                res[pos--]=rsqr;
                r--;
            }
        }
        return res;
    }
}