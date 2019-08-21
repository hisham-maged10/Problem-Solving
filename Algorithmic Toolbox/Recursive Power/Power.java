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
		return exp < 0 ? 1.0 / powRecursive(base, exp * -1 ) : powRecursive(base, exp);
	}

	public static long powRecursive(int base, int exp)
	{
		if( exp == 0 )
			return 1L;
		else
			return (long)base * powRecursive(base, --exp);
	}

}
