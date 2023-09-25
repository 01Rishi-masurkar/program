package AssignmentOOC;

public class Result 
{
	public void getresult(int x,int n,int c)
	{
		if(c == 1)
		{
			System.out.println();
			System.out.println("AFTER LINERA SEARCH");
		}
		else
		{
			System.out.println();
			System.out.println("AFTER BINARY SEARCH");
		}
		if (x == -1) 
		{
            System.out.println( n+" is not found ");
        } else 
        {
            System.out.println( n+" found at position " + (x+1));
        }
	}
}



