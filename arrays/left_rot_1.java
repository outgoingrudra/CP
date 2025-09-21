class left_rot_1{
    public static void main(String[] args) {
        int arr[]= new int[10];
        for(int i =0;i<10;i++){
            arr[i] = (int)(Math.random()*100);
        }

        for (Object elem : arr) {
              System.out.print(" "+elem);
        }
   


       int t = arr[0] ;
       for(int i  = 1;i<10;i++){
        arr[i-1]=arr[i];
       }
      arr[10-1] = t;

           System.out.println("\n after update ");

        for (Object elem : arr) {
              System.out.print(" "+elem);
        }
    
    }
}