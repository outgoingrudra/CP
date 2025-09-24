import java.util.ArrayList;

class zero_end {
    static ArrayList<Integer> move(ArrayList<Integer> arr, int n) {
        // Move non-zero elements to the front
        int nonZeroPos = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != 0) {
                arr.set(nonZeroPos, arr.get(i));
                if (nonZeroPos != i) {
                    arr.set(i, 0);
                }
                nonZeroPos++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // Demo 1: ArrayList with mixed zeros and non-zeros
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(0);
        arr1.add(3);
        arr1.add(0);
        arr1.add(5);
        arr1.add(2);
        arr1.add(0);
        
        System.out.println("Original ArrayList 1: " + arr1);
        arr1 = move(arr1, arr1.size());
        System.out.println("After moving zeros to end: " + arr1);

        // Demo 2: ArrayList with no zeros
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);
        arr2.add(4);
        
        System.out.println("\nOriginal ArrayList 2: " + arr2);
        arr2 = move(arr2, arr2.size());
        System.out.println("After moving zeros to end: " + arr2);

        // Demo 3: ArrayList with all zeros
        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(0);
        arr3.add(0);
        arr3.add(0);
        
        System.out.println("\nOriginal ArrayList 3: " + arr3);
        arr3 = move(arr3, arr3.size());
        System.out.println("After moving zeros to end: " + arr3);
    }
}