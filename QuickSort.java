package Week7_8_SortingAndSearching;

import java.util.Arrays;
/*
Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element 
as pivot and partitions the given array around the picked pivot. 
There are many different versions of quickSort that pick pivot in different ways.

-Always pick first element as pivot.
-Always pick last element as pivot (implemented below)
-Pick a random element as pivot.
-Pick median as pivot.

The key process in quickSort is partition(). Target of partitions is, given an
array and an element x of array as pivot, put x at its correct position in sorted array 
and put all smaller elements (smaller than x) before x, and put all greater elements 
(greater than x) after x. All this should be done in linear time.

In short, instead of splitting down the middle we split at our pre-defined pivot
*/
public class QuickSort {

    public static void main(String[] args) {
        
        int[] array = {5, 4, 3, 2, 1};
        
        System.out.println("Unsorted: " + Arrays.toString(array));
        
        quickSort(array, 0, array.length-1);
        
        System.out.println("\nSorted: " + Arrays.toString(array));
        
    }
    
        /* This method takes LAST element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    public static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    public static void quickSort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            quickSort(arr, low, pi-1); 
            quickSort(arr, pi+1, high); 
        } 
    } 
    
}
