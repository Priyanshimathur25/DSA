class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int [] ArrSort= new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                ArrSort[k]=nums1[i];
                i++;
                k++;
            }else{
                ArrSort[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            ArrSort[k]=nums1[i];
            i++;
            k++;
        }while(j<n){
            ArrSort[k]=nums2[j];
            j++;
            k++;
        }
        for(int l=0;l<ArrSort.length;l++){
            nums1[l]=ArrSort[l];
        }
    }
}