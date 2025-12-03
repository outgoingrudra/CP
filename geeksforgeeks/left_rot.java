// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void reverse(int arr[] ,int start , int end )
    {
        end -- ;
        while(start <= end )
        {
            int t= arr[start];
            arr[start] = arr[end];
            arr[end]= t;
            start++ ; end -- ;
        }
    }
    static void rotateArr(int arr[], int d) {
        d= d%arr.length ;
        reverse(arr,0,d);
        reverse(arr,d,arr.length);
        reverse(arr,0,arr.length);
        // add your code here
    }
}