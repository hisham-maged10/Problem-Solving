import java.util.Scanner;
public class Games
{
	public static void main(String[] args)
	{
		System.out.println(getCount());
	}

	public static int getCount()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] teams = new int[n][2];
		for( int i = 0 ; i < n ; ++i )
		{
			teams[i][0] = in.nextInt();
			teams[i][1] = in.nextInt();
		}
		int count = 0;
		for( int i = 0 ; i < n ; ++i )
		{
			for(int j = 0 ; j < n ; ++j)
			{
				if( i == j )
					continue;
				if( teams[i][0] == teams[j][1] )
					++count;
			}
		}
		return count;
	}
}
