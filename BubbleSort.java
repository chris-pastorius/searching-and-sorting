
package Week7_8_SortingAndSearching;

import java.util.Arrays;

/**
 * @author chris-pastorius
 */
public class BubbleSort {

    public static void main(String[] args) {
       
        
        int[] array = {4, 2, 1, 3};
        System.out.println(Arrays.toString(array));
        
        array = bubbleSort(array);
        System.out.println(Arrays.toString(array));
        
    }
    
    public static int[] bubbleSort(int[] arr) {
        
        int n = arr.length;
        int temp;
        
        // Loop through size of the array - 1
        for (int i = 0; i < n - 1; i++) {
            // Print the current state of the array
            System.out.println(Arrays.toString(arr));
            // Stop at n - i - 1 because we've aready bubbled up
            for (int j = 0; j < n - i - 1; j++) {
                // Compare pairs
                if(arr[j] > arr[j + 1]) {
                    System.out.println(Arrays.toString(arr));
                    System.out.println("Bubbling " + arr[j] + " szsz");
                    // Make the swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            
        }
        
        return arr;
    }

}
