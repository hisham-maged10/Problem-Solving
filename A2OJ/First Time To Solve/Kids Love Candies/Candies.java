import java.util.Scanner;
public class Candies
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int[] kids = new int[t];
		for(int i = 0, nTypes = 0, k = 0 ; t --> 0 ; ++i)
		{
			nTypes = input.nextInt();
			k = input.nextInt();
			int[] candies = new int[nTypes];
			for(int j = 0 ; j < nTypes ; ++j)
				candies[j] = input.nextInt();
			kids[i] = getKidsNumber(candies, k);
		}

		for(int e : kids)
			System.out.println(e);
	}

	public static int getKidsNumber(int[] candies, int k)
	{
		
		int count = 0;
		for(int i = 0 ; i < candies.length ; ++i)
		{
			count += candies[i] / k ;
		}
		return count;
	}
}
