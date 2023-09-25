package AssignmentOOC;

class Main {

	public static void main(String[] args) 
	{
		Select s = new Select();
		int  choice =s.getchoice();
		if(choice==1)
		{
			UserInput ui = new UserInput();
			ui.getUserInput();
			int x= ui.getitem();
			Result rs = new Result();

			LinearSearch ls = new LinearSearch();
			int k = ls.search(ui.get(), ui.getitem());
			rs.getresult(k,x,choice);
		}
		else
		{
			UserInput input = new UserInput();
			input.getUserInput();
			int x1= input.getitem();
			Result result = new Result();

			System.out.println("***for binary search the array should be in sorted order***");
			 BinarySearch bs = new BinarySearch();
			 int r = bs.search(input.get(), input.getitem());
			 result.getresult(r,x1,choice);
		}
	}

}
