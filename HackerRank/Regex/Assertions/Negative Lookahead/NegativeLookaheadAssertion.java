import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class NegativeLookaheadAssertion
{
	public static void main(String[] args)
	{
		RegexTester tester = new RegexTester();
		tester.check("(?!(.)\\1).");
	}


}

class RegexTester
{
	public void check(String regexPattern){
		
		Scanner input = new Scanner(System.in);
		System.out.print("String Input: ");
		String testString = input.nextLine();
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(testString);
		//System.out.println("Matches result: "+(m.matches()?"There's a Match!!":"Nothing Matches"));
		System.out.println("Find result: "+(m.find()?"There's a Match!!":"Nothing Matches"));
		System.out.println("Find result: "+m.group());
		/*while(m.find())
		{
			System.out.println(m.group() + "Found at index "+m.start()+" and ends at "+(m.end()-1));
		}*/
	}

}