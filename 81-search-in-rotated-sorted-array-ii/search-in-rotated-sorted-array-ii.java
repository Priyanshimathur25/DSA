class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1) != -1;
        }

        if (nums[pivot] == target) {
            return true;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1) != -1;
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1) != -1;
    }

    int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }

    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid is pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: mid-1 is pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Case 3: duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {

                // Check whether start itself is pivot
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                // Check whether end itself is pivot
                if (end > start && nums[end - 1] > nums[end]) {
                    return end - 1;
                }
                end--;
            }

            // Left half is sorted
            else if (nums[start] < nums[mid] ||
                    (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                start = mid + 1;
            }

            // Right half
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}