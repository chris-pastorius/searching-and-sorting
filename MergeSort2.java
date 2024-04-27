
package Week7_8_SortingAndSearching;

import java.util.Arrays;

/**
 * @author chris-pastorius
 */
public class MergeSort2 {

    public static void main(String[] args) {
       
        int[] array = {5, 4, 3, 2, 1};
        array = RandomUnsortedArray.numbers(1000000, 1000000);
        //System.out.println("Unsorted: " + Arrays.toString(array));
        
        System.out.println("Start.");
        array = mergeSort(array);
        System.out.println("Finish.");
        //System.out.println("Sorted: " + Arrays.toString(array));
        
    }
    
    // Divide (Recursively split array)
    public static int[] mergeSort(int[] arr) {
        
        // Base Case to stop recursion (When arrays are size 1)
        if(arr.length <= 1) {
            return arr;
        }
        
        // Find middle of the array
        int mid = arr.length / 2;
        
        // Left array
        int[] left = new int[mid];
        // Right array
        int[] right = new int[arr.length - mid];
        
        // Populate the arrays
        // (L)
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        
        //(R)
        for (int j = 0; j < right.length; j++) {
            right[j] = arr[mid + j];
        }
        
        // Show current state of arrays
        //System.out.println("LEFT ARRAY: " + Arrays.toString(left));
        //System.out.println("RIGHT ARRAY: " + Arrays.toString(right));
        
        // Recursion: Continuously split arrays
        left = mergeSort(left);
        right = mergeSort(right);
        
        // Prepare to merge back with a combo of arrays;
        int[]result = merge(left, right);
        //System.out.println("Current Array (Merged) = " 
        //    + Arrays.toString(result));
        return result;
    }
    
    // Combine arrays back together
    public static int[] merge(int[] left, int[] right) {
        
        int[] result = new int[left.length + right.length];
        
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;
        
        // Keep looping while either array has items
        while(leftPointer < left.length || rightPointer < right.length) {
            // If both left and right have elements
            if(leftPointer < left.length && rightPointer < right.length) {
                // If L < R
                if(left[leftPointer] < right[rightPointer]) {
                    result[resultPointer] = left[leftPointer];
                    leftPointer++;
                    resultPointer++;
                    // If R > L
                } else {
                    result[resultPointer] = right[rightPointer];
                    rightPointer++;
                    resultPointer++;
                }  
            }
            // If there are only elements in the left array
            else if(leftPointer < left.length) {
                result[resultPointer] = left[leftPointer];
                leftPointer++;
                resultPointer++;
            }
            // If there are only elements in the right array
            else if(rightPointer < right.length) {
                result[resultPointer] = right[rightPointer];
                rightPointer++;
                resultPointer++;
            }
        }
        return result;
    }
}
