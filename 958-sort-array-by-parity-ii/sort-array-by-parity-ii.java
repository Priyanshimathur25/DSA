class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIdx=0;
        int oddIdx=1;
        while(evenIdx<nums.length && oddIdx<nums.length){
        if(nums[evenIdx]%2==0){
            evenIdx+=2;
        }
        else if(nums[oddIdx]%2==1){
            oddIdx+=2;
        }
        else{
            int temp=nums[oddIdx];
            nums[oddIdx]=nums[evenIdx];
            nums[evenIdx]=temp;
            evenIdx+=2;
            oddIdx+=2;
        }

        }
        return nums;
    }
}