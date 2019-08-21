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
		if(n.compareTo(BigInteger.ONE) <= 0)
			return BigInteger.ONE;
		else
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

}
