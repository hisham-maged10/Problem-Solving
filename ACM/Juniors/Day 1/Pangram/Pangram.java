import java.util.Scanner;
import java.util.HashSet;
public class Pangram
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String str = input.next();
		System.out.println(isPangram(n,str.toLowerCase()));
	}

	public static String isPangram(int n , String str)
	{
		if( n < 26 )
			return "NO";
		char[] chars = str.toCharArray();
		HashSet<Character> uniqueChars = new HashSet<>(n);
		for(char c : chars)
			uniqueChars.add(c);
		for( char i = 'a' ; i <= 'z' ; ++i )
			if( !uniqueChars.contains(i) )
				return "NO";
		return "YES";
	}

}
