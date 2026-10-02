class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> num = new HashSet<>();
    for(int i:nums1){
        for(int j:nums2){
            if(i==j){
                num.add(i);
            }
        }
    }
    int [] res=new int[num.size()];
    int i=0;
    for(int j:num){
        res[i++]=j;
    }
    return res;
    }
    
}