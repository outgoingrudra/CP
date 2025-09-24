class miss{
    public static void main(String[] args) {
        
        int a[] = new int[5];
        a[0]= 1;
        a[0]= 2;
        a[0]= 3;
        a[0]= 0;
        a[0]= 5;
         int x1=0,x2=0;
        for(int i=0;i<5;i++){
            x1^=(i+1);
            x2^=a[i];


        }
        System.out.println("Ans : "+(x2-x1));
    }
}