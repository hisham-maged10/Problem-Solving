import java.util.Scanner;
public class Colors{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		String[] output = new String[t];
		for(int i = 0, n = 0 , x = 0 , y = 0 ; t --> 0 ; ++i )
		{
			n = input.nextInt();
			x = input.nextInt();
			y = input.nextInt();
			int[] colors = new int[n];
			for( int j = 0 ; j < colors.length ; ++j )
				colors[j] = input.nextInt();
			output[i] = evalColors(colors, x, y);
		}

		for(String e : output)
			System.out.println(e);
	}

	public static String evalColors(int[] colors, int x, int y)
	{
		if( colors[0] == x && colors[colors.length - 1] == y )
			return "BOTH";
		if ( colors[0] == x )
			return "EASY";
		if( colors[colors.length - 1] == y )
			return "HARD";
		return "OKAY";
	}

}
