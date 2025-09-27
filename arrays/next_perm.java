class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        
        // Step 1: Find the rightmost character that is smaller than its next character
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        
        // Step 2: If no such character exists, reverse the entire array
        if(ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        // Step 3: Find the smallest character on right side of ind that is greater than nums[ind]
        for(int i = n - 1; i > ind; i--) {
            if(nums[i] > nums[ind]) {
                // Swap nums[i] and nums[ind]
                swap(nums, i, ind);
                break; // Important: break after first swap
            }
        }
        
        // Step 4: Reverse the substring after ind
        reverse(nums, ind + 1, n - 1);
    }
    
    // Helper method to swap two elements in array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Helper method to reverse a portion of array
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}