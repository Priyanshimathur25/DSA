class Solution {
    public int minChanges(String s) {
        int changes = 0;
        
        // Check characters in pairs (0-1, 2-3, 4-5, etc.)
        for (int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                changes++;
            }
        }
        
        return changes;
    }
}
