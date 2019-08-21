import java.util.Scanner;
public class Problem
{
	public static void main(String[] args)
	{	
		System.out.println(checkProblems());
	}

	private static String checkProblems()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while( n --> 0 )
		{
			if( input.nextInt() == 1 )
				return "HARD";
		}
		return "EASY";
	}

}
