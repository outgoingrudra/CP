class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;

        long[] minPrefix = new long[k];
        boolean[] seen = new boolean[k];

        long prefix = 0;
        long ans = Long.MIN_VALUE;

        // prefix index 0 has remainder 0
        minPrefix[0] = 0;
        seen[0] = true;

        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            int r = (i + 1) % k;

            if (seen[r]) {
                ans = Math.max(ans, prefix - minPrefix[r]);
            }

            // update min prefix for this remainder
            if (!seen[r]) {
                minPrefix[r] = prefix;
                seen[r] = true;
            } else {
                minPrefix[r] = Math.min(minPrefix[r], prefix);
            }
        }

        return ans;
    }
}
