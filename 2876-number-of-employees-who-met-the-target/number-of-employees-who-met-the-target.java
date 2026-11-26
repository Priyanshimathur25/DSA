class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Arrays.sort(hours);
        int left = 0;
        int right = hours.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (hours[mid] >= target) {
                right = mid; 
            } else {
                left = mid + 1;
            }
        }
        
        return hours.length - left;
    }
}
