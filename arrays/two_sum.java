
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans = new int[2];
        ans[0]= ans[1]=-1;
        HashMap<Integer,Integer>  mpp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int more = target - num ;
            if(mpp.containsKey(more)){
                ans[0] = mpp.get(more);
                ans[1]=i;
                return ans ;
            }
            else {
                mpp.put(nums[i],i);
            }
        }
       return ans ;
        
    }
}