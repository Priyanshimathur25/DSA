class Solution {
    public boolean validPalindrome(String s) {
        int right =s.length()-1;
        int left=0;
        while(left<right){
            if(s.charAt(right)==s.charAt(left)){
                left++;
                right--;
            }else{
                return isPal(s,left+1,right)||
                isPal(s,left,right-1);
            }
        }
        return true;
    }
    private boolean isPal(String s, int left,int right){
        while(left<right){
            if(s.charAt(right)!=s.charAt(left)){
                return false;
            
            }
            right--;
            left++;
            
        }
        return true;
    }
}