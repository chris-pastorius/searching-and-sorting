
package Week7_8_SortingAndSearching;

/**
 * @author chris-pastorius
 */
public class JumpSearch {

    public static void main(String[] args) {
        
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        
        System.out.println(x + " found at index " + jumpSearch(array, x));
       
    }
    
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        
        while(arr[Math.min(step, n) - 1] < x) {
            System.out.println("Current step " + arr[step]);
            // Store current step in previous
            prev = step;
            
            // Take next step
            step += (int) Math.floor(Math.sqrt(n));
            
            // If we exceed array size x not found
            if(prev >= n) {
                return -1;
            }
        }
        // As soon as arr[step] > x 
        // AND not >=n we break the loop
        System.out.println("\n We found a value larger than " + x 
            + " at index " + step + " so we jump back to " + prev);
        
        // Take step back and perform linear search
        while(arr[prev] < x) {
            prev++; 
            System.out.println("Stepping gently ... to " + arr[prev]);
        }
        // Found it!
        if(arr[prev] == x) {
            System.out.println("Found it!");
                return prev;
            }
        return -1;
    }

}
