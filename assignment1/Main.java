package assignment1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number ");
		double n1 = in.nextDouble();
		System.out.println("Enter a number ");
		double n2 = in.nextDouble();
		System.out.println("Choose the opreation ");
		System.out.println("press 1 for addition \npress 2 for subtraction \npress 3 for multiplication \npress 4 for dvision ");
		int c =in.nextInt();
		switch(c)
		{
		case 1:
			Addition a = new Addition();
			a.add(n1,n2);
			break;
		case 2:
			Substractions s = new Substractions();
			s.sub(n1,n2);
			break;
		case 3:
			Multiplication m = new Multiplication();
			m.mul(n1,n2);
			break;
		case 4:
			Division d = new Division();
			d.div(n1,n2);
			break;
		default:
			System.out.println("invalid number");
		}
		in.close();

	}

}
