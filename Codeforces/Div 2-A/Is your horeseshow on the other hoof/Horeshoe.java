import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Horeshoe
{
	public static void main(String[] args)
	{
		System.out.println(getCount());
	}

	public static int getCount()
	{
		Scanner in = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for( int i = 0 ; i < 4 ; ++i)
		{
			if( !set.add(in.nextInt()) )
				++count;
		}
		return count;
	}
}
