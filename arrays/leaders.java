class Solution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        
        if (n == 0) return ans; // Handle empty array
        
        // The rightmost element is always a leader
        int max = nums[n - 1];
        ans.add(max);
        
        // Traverse from right to left
        for(int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        
        // Reverse to get leaders in left-to-right order
        Collections.reverse(ans);
        return ans;
    }
}

