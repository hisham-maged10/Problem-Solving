import java.util.Scanner;
public class WordCapital
{
	public static void main(String[] args)
	{
		System.out.println(capitalize());
	}

	public static String capitalize()
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] c = s.toCharArray();
		c[0] = Character.toUpperCase(c[0]);
		return new String(c);
	}
}
