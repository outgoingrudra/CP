class left_rot_k{
    public static  void rev(int a[],int s ,int e){
        while(s<e){
            int t= a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }

    }
    public static void main(String[] args) {

        int d = 4;
        int arr[]= new int[10];
        for(int i =0;i<10;i++){
            arr[i] = (int)(Math.random()*100);
        }

        for (Object elem : arr) {
              System.out.print(" "+elem);
        }
   

        d=d%arr.length;
      rev(arr,0,d-1);
      rev(arr,d,arr.length-1);     // ✅ corrected here
      rev(arr,0,arr.length-1);


           System.out.println("\n after update ");

        for (Object elem : arr) {
              System.out.print(" "+elem);
        }
    
    }
}