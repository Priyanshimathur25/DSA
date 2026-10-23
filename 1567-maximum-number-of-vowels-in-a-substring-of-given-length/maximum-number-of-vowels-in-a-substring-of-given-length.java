class Solution {
    public boolean isVowel(char c){
        return "aeiou".indexOf(c)>=0;
    }
    public int maxVowels(String s, int k) {
        int count=0;
        int maxc=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
                maxc=count;
            }
        }
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            maxc=Math.max(maxc,count);
        }
        return maxc;
    }
}