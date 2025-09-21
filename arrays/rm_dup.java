// remove duplicates from sorted array

class rm_dup{
    public static void main(String[] args) {

        int   arr[] =new int[6];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        arr[3]=2;
        arr[4]=2;
        arr[5]=3;

        int i =0;
        for(int j=1;j<6;j++){
            if(arr[i]<arr[j]){
                arr[++i]=arr[j];
            }
        }
        for(int t=0;t<i+1;t++){
            System.out.println(" "+arr[t]);
        }
      

        
    }
}