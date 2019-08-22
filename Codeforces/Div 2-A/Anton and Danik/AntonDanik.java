import java.util.Scanner;
public class AntonDanik
{
	public static void main(String[] args)
	{
		System.out.println(getWinner());
	}

	private static String getWinner()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String s = input.next();
		int aCount = 0, dCount = 0;
		for( int i = 0 ; i < n ; ++i)
			if( s.charAt(i) == 'A' )
				++aCount;
			else
				++dCount;
		if ( aCount > dCount )
			return "Anton";
		else if ( dCount > aCount )
			return "Danik";
		else
			return "Friendship";

	}

}
