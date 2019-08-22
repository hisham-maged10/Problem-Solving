import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class Stones
{
	public static void main(String[] args)
	{
		System.out.println(getNumber());
	}

	public static int getNumber()
	{
		Scanner in = new Scanner(System.in);
		int nStones = in.nextInt();
		String s = in.next();
		Deque<Character> distinct = new ArrayDeque<>();
		Deque<Character> filtered = new ArrayDeque<>();
		char c = s.charAt(0);
		distinct.push(c);
		for(int i = 1 , n = s.length() ; i < n ; ++i)
		{
			c = s.charAt(i);
			if(distinct.peek() != c)
				distinct.push(c);
			else
				filtered.push(c);
		}
		return filtered.size();
	}
}
