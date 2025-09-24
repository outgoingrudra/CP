class miss2{
    public static void main(String[] args) {
        
           
        int a[] = new int[5];
        a[0]= 1;
        a[0]= 2;
        a[0]= 3;
        a[0]= 0;
        a[0]= 5;

        int s = 5*((5+1)/2);
        for(int i=0;i<5;i++){
            s-=a[i];
        }
       System.out.println("Ans : "+s);

    }
}