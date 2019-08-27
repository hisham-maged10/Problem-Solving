import java.util.Scanner;
public class Oskols
{
	public static void main(String[] args)
	{
		getBirds();
	}

	public static void getBirds()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] wire = new int[n];
		for( int i = 0 ; i < wire.length ; ++i )
			wire[i] = in.nextInt();
		int m = in.nextInt();
		for( int i = 0 ,idxWire = 0, bird = 0, left = 0, right = 0; i < m ; ++i )
		{
			idxWire = in.nextInt() - 1;
			bird = in.nextInt();
			left = bird-1;
			right =  wire[idxWire] - bird ;
			wire[idxWire] = 0;
			if( idxWire - 1 >= 0 )
				wire[idxWire-1] += left;
			if ( idxWire + 1 < wire.length )
				wire[idxWire+1] += right;

		}

		for(int i : wire )
			System.out.println(i);
	}
}
