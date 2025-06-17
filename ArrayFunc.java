import java.util.Arrays;

public class ArrayFunc {
    public static void main(String[]args){
        int[] arr = {1,4,25,9,16};
        Arrays.sort(arr);              // Sorts the array
        Arrays.toString(arr);          // Returns string representation: [1, 3, 4, 5]
        Arrays.binarySearch(arr, 4);   // Searches for 4 in array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Index of 4: " + Arrays.binarySearch(arr, 4));
        System.out.println("Index of 10: " + Arrays.binarySearch(arr, 10)); // Not found, returns negative index
    }
}
