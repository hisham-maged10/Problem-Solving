import java.util.Scanner;
public class Power
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int base = input.nextInt();
		int exp = input.nextInt();
		double result = powMain(base,exp);
		System.out.println(result);
	}

	public static double powMain(int base, int exp)
	{
		return exp < 0 ? 1.0 / powIterative(base, exp * -1 ) : powIterative(base, exp);
	}

	public static long powIterative(int base, int exp)
	{
		long result = 1;
		for( int i = 0 ; i < exp ; ++i )
			result *= base;
		return result;
	}

}
