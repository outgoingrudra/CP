class zero_end2 {
    public static void main(String[] args) {
        // Create an array of 10 elements
        int[] arr = new int[10];
        
        // Manually place 4 zeros at specific positions
        int zeroCount = 4;
        arr[1] = 0; // Position 1
        arr[3] = 0; // Position 3
        arr[5] = 0; // Position 5
        arr[7] = 0; // Position 7
        
        // Fill remaining positions with manual non-zero values
        arr[0] = 10;
        arr[2] = 20;
        arr[4] = 30;
        arr[6] = 40;
        arr[8] = 50;
        arr[9] = 60;

        // Move zeros to end
        int t = 0;
        int j = 0;
        for (int i = 0; i < 10; i++) { // Fixed loop to start from i=0
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            } else {
                t++;
            }
        }
        for (int i = 0; i < t; i++) {
            arr[j++] = 0;
        }

        // Print the array
        System.out.println("Array with " + zeroCount + " zeros:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}