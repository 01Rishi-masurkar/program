package AssignmentOOC;
import java.util.Arrays;
public class BinarySearch 
{
	private int result=-1;
    public int search(int[] a, int item) 
    {    
    	Arrays.sort(a);
    	System.out.println(Arrays.toString(a));  
        int low = 0;
        int high = a.length - 1;
        int mid;

        while (low <= high) {
            mid = low+(high-low) / 2;
            if (a[mid] == item) {
                result = mid;
                break;
            } else if (a[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

}
