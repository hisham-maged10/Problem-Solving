import java.math.BigInteger;
import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		BigInteger n = new BigInteger(input.next());
		BigInteger result = Factorial.factorial(n);
		System.out.println(result);
	}
	
	public static BigInteger factorial(BigInteger n)
	{
		BigInteger result = BigInteger.ONE;

		for(BigInteger i = new BigInteger("2") ; i.compareTo(n) <= 0 ; i = i.add(BigInteger.ONE))
		{
			result = result.multiply(i);
		}

		return result;
	}
}
