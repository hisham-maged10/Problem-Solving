import java.util.Scanner;
public class Palindrome{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		String result = Palindrome.checkPalindrome(word);
		System.out.println(result);
	}


	public static String checkPalindrome(String word){
		if( word.isEmpty() || word.length() == 1 )
			return "YES";
		else if ( word.charAt(0) == word.charAt(word.length() - 1) )
			return checkPalindrome(word.substring(1, word.length() - 1));
		else
			return "NO";

	}
}
