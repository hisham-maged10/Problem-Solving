import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;
public class Magnets
{
	public static void main(String[] args)
	{
		System.out.println(getGroups());
	}

	public static int getGroups()
	{
		Scanner in = new Scanner(System.in);
		int nMag = in.nextInt() , count = 1;
		Deque<String> groups = new ArrayDeque<>(nMag);
		String magnet = in.next();
		groups.push(magnet);
		for(int i = 1 ; i < nMag ; ++i)
		{
			magnet = in.next();
			if( !groups.peek().equals(magnet) )
				++count;
			groups.push(magnet);
		}
		return count;
	}
}
