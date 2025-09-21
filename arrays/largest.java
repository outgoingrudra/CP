// find the largest element 

class largest {
    public static void main(String[] args) {
        int arr[]= new int[50];
        for(int i =0;i<50;i++){
            arr[i] = (int)(Math.random()*100);
        }



        // main sec
        int largest = Integer.MIN_VALUE;
        for(int x : arr){
            if (x>largest){
                largest= x;

            }
        }
        System.out.println("largest element : "+largest);
    }
}