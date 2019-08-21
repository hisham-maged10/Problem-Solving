import java.util.Scanner;
public class Autori
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(getShort(input.nextLine()));
	}

	public static String getShort(String str)
	{
		if(str.isEmpty())
			return "";
		String[] words = str.split("-");
		StringBuilder sb = new StringBuilder();
		for(String e : words)
			sb.append(e.charAt(0));
		return sb.toString();

	}

}
