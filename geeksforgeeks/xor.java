class Solution {
    public int subarrayXor(int[] arr) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long freq = (long)(i + 1) * (n - i);  // avoid integer overflow

            if ((freq & 1) == 1) {   // check if freq is odd
                ans ^= arr[i];
            }
        }

        return ans;
    }
}
