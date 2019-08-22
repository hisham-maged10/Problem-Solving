import java.util.Scanner;
public class Petya
{
	public static void main(String[] args)
	{
		System.out.println(getComparison());
	}

	public static String getComparison()
	{
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine() , s2 = in.nextLine();

		int c = s1.compareToIgnoreCase(s2);
		return c > 0 ? "1" : ( c < 0 ? "-1" : "0");
	}
}	
