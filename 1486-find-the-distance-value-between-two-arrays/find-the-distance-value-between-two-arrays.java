class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int distanceValue=0;
        int j=0;
        for(int i=0;i<arr1.length;i++){
            while (j < arr2.length && arr2[j] < arr1[i] - d) {
                j++;
            }
            if (j < arr2.length && arr2[j] <= arr1[i] + d) {
                continue;
            }
            
            distanceValue++;
        }
        
        return distanceValue;
        }
    }
