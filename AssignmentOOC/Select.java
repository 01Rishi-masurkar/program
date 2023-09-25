package AssignmentOOC;
import java.util.Scanner;
public class Select 
{
	public int getchoice() 
	{
		Scanner in = new Scanner(System.in);
		
        // user can choice which technique he wants to use;
        System.out.println("!!!!!Enter your choice!!!!!");
        System.out.println("Press 1 for Linear Search \nPress 2 for Binary Search");
        int choice = in.nextInt();
        return choice;
         
    }
}




