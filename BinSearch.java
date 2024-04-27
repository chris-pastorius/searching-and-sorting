
package Week7_8_SortingAndSearching;

/**
 * @author chris-pastorius
 */
public class BinSearch {

    public static void main(String[] args) {
       
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 4;
        
        System.out.println(x + " found at index " + binSearch(array, x));
    }
    
    public static int binSearch(int[] arr, int x) {
        
        int start = 0;
        int end = arr.length - 1;
        int mid;
        
        while(start <= end) {
            // Find the middle
            mid = (start + end) / 2;
            
            // Print what is happening
            System.out.println("INDEX START = " + start + " END = " + end 
                + " MID = " + mid);
            System.out.println("VALUE START = " + arr[start] 
                + " END = " + arr[end] + " MID = " + arr[mid] + "\n");
            
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i]);
            }
            System.out.println("\n");
            
            // If the middle is what we're looking for
            if(arr[mid] == x) {
                return mid;
            } 
            // If the current mid is greater than x, move end down
            else if(arr[mid] > x) {
                end = mid - 1;
            } 
            // If the current mid is less than x, move start up
            else if(arr[mid] < x) {
                start = mid + 1;
            }
        }
        // If element is not in the array
        return -1;
    }
}
