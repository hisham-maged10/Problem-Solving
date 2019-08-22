import java.util.Scanner;
public class Night
{
	public static void main(String[] args)
	{
		System.out.println(getRotations());
	}

	public static int getRotations()
	{
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int diff = 'a' - s.charAt(0);
		int rot1 = 0 , rot2 = 0;
		int rotations = 0;
		if ( diff != 0 )
		{
			rot1 = diff < 0 ? (diff + 26) : (diff) ;
			rot2 = diff < 0 ? (diff * -1 ) :( diff * -1 + 26 );
			rotations = rot1 < rot2 ? rot1 : rot2;
		}
		for(int i = 1 , n = s.length() ; i < n ; ++i)
		{
			diff = s.charAt(i-1) - s.charAt(i);
			if(diff == 0)
				continue;
			rot1 = diff < 0 ? (diff + 26) : (diff) ;
			rot2 = diff < 0 ? (diff * -1 ) :( diff * -1 + 26 );
			rotations += rot1 < rot2 ? rot1 : rot2;
		}
	
		return rotations;
	
	}
	
}
