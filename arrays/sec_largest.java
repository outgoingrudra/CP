// find the second largest element 

class sec_largest {
    public static void main(String[] args) {
        int arr[]= new int[10];
        for(int i =0;i<10;i++){
            arr[i] = (int)(Math.random()*100);
        }

        for (Object elem : arr) {
              System.out.print(" "+elem);
        }
   


        // main sec
        int largest = arr[0];
        int sec = Integer.MIN_VALUE;
        for(int x : arr){
            if (x>largest){
                sec = largest;
                largest= x;
                

            }
            else if(x>sec && x < largest){
                   sec = x;
            }
        }
        System.out.println("\n second largest element : "+sec);
    }
}