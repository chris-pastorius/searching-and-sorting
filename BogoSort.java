
package Week7_8_SortingAndSearching;

import java.util.Arrays;

/**
 * @author chris-pastorius
 */
public class BogoSort {

    public static void main(String[] args) {
       
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Unsorted: " + Arrays.toString(arr));
        
        arr = bogoSort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
        
    }
    public static int[] bogoSort(int[] arr) {
        int attempts = 0;
        int n = arr.length;
        boolean isSorted = false;
        
        while(!isSorted) {
            // Generate two random numbes from array
            int r1 = (int)(Math.random()* n);
            int r2 = (int)(Math.random()* n);
            
            // Swap the random numbers
            int temp = arr[r1];
            arr[r1] = arr[r2];
            arr[r2] = temp;
            System.out.println("BOGO: " + Arrays.toString(arr));
            
            // Check if sorted
            for (int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    isSorted = false;
                    break;
                } else {
                    isSorted = true;
                }
            }
            attempts++; 
        }
        System.out.println("Total attempts = " + attempts);
        return arr;
    }
}
