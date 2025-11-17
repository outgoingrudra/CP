// Given an array of positive integers arr[], find the maximum sum of a subsequence such that the elements of the subsequence form a strictly increasing sequence.
// In other words, among all strictly increasing subsequences of the array, return the one with the largest possible sum

// approach dynamic programming 
class Solution {
    public int maxSumIS(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];

       
        for (int i = 0; i < n; i++) {
            dp[i] = arr[i];
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
