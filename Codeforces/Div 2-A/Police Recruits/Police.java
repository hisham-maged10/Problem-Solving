import java.util.Scanner;
public class Police
{
	public static void main(String[] args)
	{
		System.out.println(getCrimes());
	}

	public static int getCrimes()
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int officers = 0 , crimes = 0 , event = 0;
		for(int i = 0 ; i < n ; ++i )
		{
			event = in.nextInt();
			if( event > 0 )
				officers += event;
			else
			{
				if( officers == 0 )
					++crimes;
				else
					--officers;
			}
		}
		return crimes;
	}

}
