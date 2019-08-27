import java.util.Scanner;
public class Juicer
{
	public static void main(String[] args)
	{
		System.out.println(getWaste());
	}

	public static int getWaste()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt() , maxSize = in.nextInt(), sum = 0, overflow = in.nextInt(), count = 0;
		for(int i = 0 , orange = 0 ; i < n ; ++i)
		{
			orange = in.nextInt();
			if( orange <= maxSize )
				sum += orange;
			if( sum > overflow )
			{
				++count;
				sum = 0;
			}
		}
		return count;
	}

}
