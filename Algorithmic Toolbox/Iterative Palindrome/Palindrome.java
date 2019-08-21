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
		char[] arr = word.toCharArray();
		int mid = (arr.length - 1) % 2 == 0 ? (int)( (arr.length - 1) / 2 ) :  (int)( arr.length / 2 );
		for( int i = 0, length = arr.length - 1  ; i < mid ; ++i)
			if( arr[i] != arr[length - i] )
				return "NO";
		return "YES";
	}
}
