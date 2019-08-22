import java.util.Scanner;
public class VanyaFence
{
	public static void main(String[] args)
	{
		System.out.println(VanyaFence.getMinWidth());

	}

	private static int getMinWidth()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int h = input.nextInt();
		int w = 0;
		for( int i = 0 ; i < n ; ++i )
			if( input.nextInt() > h )
				w += 2 ;
			else
				++w;
		return w;
	}
}
