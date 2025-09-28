
class Solution {
    public int longestConsecutive(int[] nums) {
        
        Arrays.sort(nums);
        int longest = 1;
        int cnt =1;
        int last = Integer.MIN_VALUE ;

        for(int i =0; i < nums.length ; i++ ){
            if(nums[i]-1 == last ){
                cnt ++;
                last = nums[i];
            }
            else if(nums[i]==last){

            }
            else {
                last = nums[i];
                cnt =1;
            }
            longest = Math.max(longest , cnt);
        }
        return longest ;
    }
}