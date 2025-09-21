class left_rot {
    public static void main(String[] args) {
        int d = 4;
        int arr[]= new int[10];
        for(int i =0;i<10;i++){
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println("Before rotation:");
        for (int elem : arr) {
            System.out.print(" "+elem);
        }

        d = d % arr.length;
        int t[] = new int[d];

        // Step 1: store first d elements
        for(int i=0;i<d;i++){
            t[i] = arr[i];
        }

        // Step 2: shift remaining elements to the left
        for(int i=d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }

        // Step 3: copy temp back to end
        for(int i=0;i<d;i++){
            arr[arr.length - d + i] = t[i];
        }

        System.out.println("\nAfter rotation:");
        for (int elem : arr) {
            System.out.print(" "+elem);
        }
    }
}
