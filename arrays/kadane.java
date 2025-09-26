class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int s =0;
        for(int x : nums ){
            s+= x;
            if(s>max) max = s;
            if(s<0) s =0;
        }
        return max;
        
    }
}