class Solution {
    public int majorityElement(int[] nums) {
            
      int cnt =0;
      int el =0;
      for(int  x : nums ){
        if(cnt==0){
            el=x;
            cnt=1;
        }
        else if(el==x) cnt++;
        else cnt --;
      }
      int v =0;
      for(int x : nums){
        if(el==x){
            v++;
        }
      }
      return el;
    }
}