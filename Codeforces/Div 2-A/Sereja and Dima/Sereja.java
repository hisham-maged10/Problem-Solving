import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class Sereja
{
	public static void main(String[] args)
	{
		System.out.println(getPoints());
	}

	public static String getPoints()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt() , p1 = 0 , p2 = 0;
		Deque<Integer> cards = new ArrayDeque<>();
		for( int i = 0 ; i < n ; ++i)
		{
			cards.offer(in.nextInt());
		}
		while(!cards.isEmpty())
		{
			p1 += cards.peekFirst() > cards.peekLast() ? cards.removeFirst() : cards.removeLast() ;
			if(!cards.isEmpty())
			p2 += cards.peekFirst() > cards.peekLast() ? cards.removeFirst() : cards.removeLast() ;
		}

		return p1 + " " + p2;
	
	}
}
