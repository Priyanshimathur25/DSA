import java.util.Arrays;

class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        int low = nums[0];
        for (int x : nums) {
            if (x < low) {
                low = x;
            }
        }
        for (int x : nums) {
            moves += (x - low);
        }
        
        return moves;
    }
}
