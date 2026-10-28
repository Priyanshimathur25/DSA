
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> ans = new ArrayList<>();
        
        for (int len = 2; len < 10; len++) {
            for (int i = 0; i <= s.length() - len; i++) {
                int digit = Integer.parseInt(s.substring(i, i + len));
                if (digit >= low && digit <= high) {
                    ans.add(digit);
                }
            }
        }
        return ans;
    }
}