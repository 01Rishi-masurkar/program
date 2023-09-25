package AssignmentOOC;
import java.util.Scanner;
public class UserInput 
{
	private int[] a;
    private int size, item;
    
    public void getUserInput()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        size = input.nextInt();
        a = new int[size];
        
        for (int i = 0; i < size; i++) 
        {
            System.out.print("Enter element " + (i+1) + ": ");
            a[i] = input.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        item = input.nextInt();
        
    }
    
    public int[] get() 
    {
        return a;
    }

    public int getSize() 
    {
        return size;
    }

    public int getitem() 
    {
        return item;
    }
    
}

