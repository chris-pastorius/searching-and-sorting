
package Week7_8_SortingAndSearching;

import java.util.Scanner;

/**
 * @author chris-pastorius
 */
public class LinearSearch {

    public static void main(String[] args) {
       
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a element to search: ");
        int n = scan.nextInt();
        
        int index = linearSearch(array, n);
        System.out.println("Found " + n + " at index " + index);
        
    }
    
    public static int linearSearch(int[] arr, int x) {
        
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            
            if(x == arr[i]) {
                return i;
            }
            
        }
        return -1;
    }
    
    
    

}
