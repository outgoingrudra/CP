// check array sorted  

class issorted {
    public static void main(String[] args) {
        int arr[]= new int[50];
        for(int i =0;i<50;i++){
            arr[i] = (int)(Math.random()*100);
        }

         for (Object elem : arr) {
              System.out.print(" "+elem);
        }
   



            int prev = arr[0];
            int flag = 1;

        for(int x : arr){
            if(prev>x){
                flag = 0;
                break;
            }
            prev = x;
            
        }
        System.out.println((flag==1) ? "\nSorted":"\nNot Sorted");
    }
}