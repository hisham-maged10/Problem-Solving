import java.util.Scanner;
public class Word
{
	public static void main(String[] args)
	{
		System.out.println(correct());
	}

	public static String correct()
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int lCount = 0 , uCount = 0;
		for( int i = 0 , n = s.length() ; i < n ; ++i)
			if ( Character.isUpperCase(s.charAt(i)) )
				++uCount;
			else
				++lCount;
		return uCount > lCount ? s.toUpperCase() : s.toLowerCase();
	}
}
