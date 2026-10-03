class Solution {
    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }


            else {
                if (st.isEmpty() || st.pop() != map.get(c)) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}