import java.util.Arrays;
import java.util.Scanner;
public class Gravity
{
	public static void main(String[] args)
	{
		getOrder();
	}

	public static void getOrder()
	{
		Scanner input = new Scanner(System.in);
		int nc = input.nextInt();
		int[] cubes = new int[nc];
		for( int i = 0 ; i < nc ; ++i)
			cubes[i] = input.nextInt();
		Arrays.sort(cubes);
		for(int i = 0 ; i < cubes.length ; ++i)
			if( i == cubes.length - 1)
				System.out.print(cubes[i]);
			else
				System.out.print(cubes[i]+" ");
	}
}
