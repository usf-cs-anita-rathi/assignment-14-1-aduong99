import java.util.*;

public class HandShakesDemo 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter No.Of People: ");
		int number = scan.nextInt();
		HandShakes obj=new HandShakes();
		int sum = obj.howManyHandShakes(number);
		System.out.println("Total HandShakes By "+number+" People are " + sum);
	}
}
