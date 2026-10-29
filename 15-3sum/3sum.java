import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            if (nums[i] > 0) {
                break;
            }
            
            int l = i + 1;
            int h = nums.length - 1;
            
            while (l < h) {
                int currentSum = nums[i] + nums[l] + nums[h];
                
                if (currentSum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    
                    while (l < h && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < h && nums[h] == nums[h - 1]) {
                        h--;
                    }
                    l++;
                    h--;
                } else if (currentSum < 0) {
                    l++;
                } else {
                    h--;
                }
            }
        }
        return ans;
    }
}
