class Solution {

    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) {
            return ans;
        }

        int sum = 0;
        if (k > 0) {

            for (int x = 1; x <= k; x++) {
                sum += code[x % n];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;

            
                sum -= code[(i + 1) % n];

            
                sum += code[(i + k + 1) % n];
            }

        } else {

            k = -k;

            for (int x = 1 ; x <= k; x++) {
                sum += code[(n - x) % n];
            }

            for (int i = 0; i < n; i++) {
                ans[i] = sum;

                sum -= code[(i - k + n) % n];

                sum += code[(i + n ) % n];
            }
        }

        return ans;
    }
}