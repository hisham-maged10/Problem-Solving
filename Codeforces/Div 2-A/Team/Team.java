import java.util.Scanner;
public class Team
{
	public static void main(String[] args)
	{
		System.out.println(getNumber());
	}

	public static int getNumber()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt() , pCount = 0;
		for ( int i = 0 , lineSum = 0 ; i < n ; ++i )
		{
			lineSum = input.nextInt() + input.nextInt() + input.nextInt();
			if ( lineSum >= 2 )
				++pCount;
		}
		return pCount;
	}

}
