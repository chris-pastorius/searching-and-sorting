
package Week7_8_SortingAndSearching;

import java.util.Arrays;

/**
 * @author chris-pastorius
 */
public class SelectionSort {

    public static void main(String[] args) {
       
        int[] array = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(array));
        
        array = selectionSort(array);
        System.out.println(Arrays.toString(array));
        
    }
    
    public static int[] selectionSort(int[] arr) {
        
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Back to the start.");
            int min = i;
            // Nested loop
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                    System.out.println("New min at index " + j 
                        + " = " + arr[j]);
                } 
            }
            System.out.println("Settled on index " + min + " (" + arr[min] 
                + ") as the min element to swap.");
            // Leave nested loop, time to swap!
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

}
