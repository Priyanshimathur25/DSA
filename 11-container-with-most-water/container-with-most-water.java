class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right=height.length-1;
        int area=0;
        while(left<right){

            area=Math.max(area,Math.min(height[left],height[right])*(right-left));
            if(height[right]<height[left]){
                right--;
            }
            else{
                left++;
            }
        }
        return area;
    }
}