class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isPalindrome = true;
            int n = word.length();
            for (int j = 0; j < n / 2; j++) {
                int end = n - 1 - j;
                if (word.charAt(j) != word.charAt(end)) {
                    isPalindrome = false;
                    break; 
                }
            }
            if (isPalindrome) {
                return word;
            }
        }
    
        return "";
    }
}
