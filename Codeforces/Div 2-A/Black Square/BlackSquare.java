import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class BlackSquare
{
	public static void main(String[] args)
	{
		System.out.println(getCalories());
	}

	private static int getCalories()
	{
		Scanner in = new Scanner(System.in);
		Map<Character,Integer> map = new HashMap<>();
		for( char i = '1' ; i <= '4' ; ++i )
		{
			map.put(i,in.nextInt());
		}
		
		String s = in.next();
		int calories = 0 ;
		for(int i = 0 , n = s.length() ; i < n ; ++i)
			calories += map.getOrDefault(s.charAt(i),0);
		return calories;
	}

}
