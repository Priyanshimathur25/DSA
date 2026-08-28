class Solution {

    public boolean isPalindromic(String s) {

        StringBuilder ans = new StringBuilder();

        for (char c : s.toCharArray()) {
            ans.append(toBinary(c));
        }

        for (int i = 0, j = ans.length() - 1; i < j; i++, j--) {
            if (ans.charAt(i) != ans.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    String toBinary(char c) {

        int n = c;
        StringBuilder binary = new StringBuilder();

        while (n > 0) {
            binary.append((char) ('0' + n % 2));
            n /= 2;
        }

        while (binary.length() < 8) {
            binary.append('0');
        }

        binary.reverse();

        return binary.toString();
    }
}