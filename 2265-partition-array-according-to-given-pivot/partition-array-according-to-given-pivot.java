class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int LP = 0;
        int EP = 0; 
        int GP = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                LP++;
            } else if (nums[i] == pivot) {
                EP++;
            } else {
                GP++;
            }
        }
        
        int[] ans = new int[nums.length];
        
        int l = 0;          
        int j = LP;         
        int k = LP + EP;   
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                ans[l] = nums[i];
                l++;
            } else if (nums[i] == pivot) {
                ans[j] = nums[i];
                j++;
            } else {
                ans[k] = nums[i];
                k++;
            }
        }
        
        return ans;
    }
}
