import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Roll
{
	public static void main(String[] args)
	{
		System.out.println(getProb());
	}

	public static String getProb()
	{
		Scanner in = new Scanner(System.in);
		int y = in.nextInt() , w = in.nextInt(), max = y > w ? y : w;
		int nom = 0;
		while( max <= 6 )
		{
			++nom;
			++max;
		}
		Map<Integer,String> map = new HashMap<>(6);
		map.put(0,"0/1");
		map.put(1,"1/6");
		map.put(2,"1/3");
		map.put(3,"1/2");
		map.put(4,"2/3");
		map.put(5,"5/6");
		map.put(6,"1/1");

		return map.get(nom);
	}

}
