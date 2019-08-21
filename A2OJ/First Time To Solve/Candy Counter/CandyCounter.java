import java.util.TreeMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
public class CandyCounter
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		String[] outputs = new String[t];
		for( int i = 0 ; t --> 0 ; ++i )
			outputs[i] = getMaxChar(input.nextLine());
		for(String e : outputs)
			System.out.println(e);
	}

	public static String getMaxChar(String str)
	{
		char[] chars = str.toCharArray();
		Map<Character,Integer> charsMap = new TreeMap<>();
		for(int i = 0, count = 0 ; i < chars.length ; ++i )
		{
			count = charsMap.getOrDefault(chars[i],0);
			charsMap.put(chars[i],++count);
		}
		char maxChar = '\u0000';
		int maxCount = 0 ;
		for(Map.Entry<Character,Integer> e : charsMap.entrySet())
		{
			if( e.getValue() > maxCount )
			{
				maxChar = e.getKey();
				maxCount = e.getValue();
			}
		}

		return maxCount + " " + maxChar;
	}

}
