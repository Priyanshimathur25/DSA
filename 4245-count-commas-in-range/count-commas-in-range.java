class Solution {
    public int countCommas(int n) {
        int num;
        if(n<1000){
            return 0;
        }
        else{
            num=n-1000;
            num++;
        }
        return num;
        
    }
}