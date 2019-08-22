import java.util.Scanner;
public class Bear
{
	public static void main(String[] args)
	{
		System.out.println(getYears());
	}

	public static int getYears()
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt() , b = input.nextInt() , count = 0;
		while(true)
		{
			++count;
			a*=3;
			b*=2;
			if( a > b )
				break;
		}
		return count;
	}

}
