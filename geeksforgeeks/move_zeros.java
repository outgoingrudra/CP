class Solution {
    void pushZerosToEnd(int[] arr) {
        int j = 0;
        // code here
        for(int i =0 ;i < arr.length ; i++ )
        {
            if(arr[i]> 0)
               arr[j++]= arr[i];
              
        }
        for(;j<arr.length;j++)
            arr[j] = 0;
    }
}