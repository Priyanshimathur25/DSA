class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int best=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=l;j<=r&&j+i<=n;j++){
                int total=0;
                for(int k=i;k<i+j;k++){
                    total+=nums.get(k);
                }
                if(total>0){
                    best=Math.min(best,total);
                }
            }
        }
        if(best==Integer.MAX_VALUE){
            return -1;
        }
        return best;
    }
}