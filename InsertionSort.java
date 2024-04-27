
package Week7_8_SortingAndSearching;

import java.util.Arrays;

/**
 * @author chris-pastorius
 */
public class InsertionSort {

    public static void main(String[] args) {
       
        int[] array = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(array));
        
        array = insertionSort(array);
        System.out.println(Arrays.toString(array));

        
    }
    
    public static int[] insertionSort(int[] arr) {
        
        int n = arr.length;
        // Key is (i) or temp variable | j item to the left
        int key, j;
        
        // Start at 1 because AIOOB (array index out of bounds)
        for (int i = 1; i < n; i++) {
            System.out.println("\nBack to the start.");
            key = arr[i]; // temp
            j = i - 1; // Allows us to look to the left
            
            while(j >= 0 && arr[j] > key) {
                // Store the element to the right in j (left)
                arr[j + 1] = arr[j];
                // Move j to the left
                j = j - 1;
               // System.out.println("j being shifted " + Arrays.toString(arr));
            }
            System.out.println("Exit the inner while loop.");
            arr[j + 1] = key;
            System.out.println("i being shifted " + Arrays.toString(arr));
        }
        
        
        return arr;
    }

}
