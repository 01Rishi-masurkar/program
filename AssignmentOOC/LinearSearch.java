package AssignmentOOC;

public class LinearSearch 
{
    private int result = -1;
    
    public int search(int[] a, int item)
    {
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == item) 
            {
                result = i;
                break;
            }
        }
        return result;
    }
}
