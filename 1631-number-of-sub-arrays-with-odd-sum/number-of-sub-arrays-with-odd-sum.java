class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = (int) (1e9 + 7);
        int count = 0;
        int currentSum = 0;
        
        int evenCount = 1; 
        int oddCount = 0;

        for (int num : arr) {
            currentSum += num;

            if (currentSum % 2 != 0) {
                count = (count + evenCount) % MOD; 
                oddCount++;
            } else {
                count = (count + oddCount) % MOD;  
                evenCount++;
            }
        }

        return count;
    }
}
