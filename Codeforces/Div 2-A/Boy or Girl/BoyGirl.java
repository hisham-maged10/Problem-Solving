import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class BoyGirl
{
	public static void main(String[] args)
	{
		System.out.println(findOut());
	}

	private static String findOut()
	{
		Scanner in = new Scanner(System.in);
		Set<Character> c = new HashSet<>();
		String s = in.nextLine();
		for( int i = 0 , n = s.length() ; i < n ; ++i)
			c.add(s.charAt(i));
		return c.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!";
	}

}
