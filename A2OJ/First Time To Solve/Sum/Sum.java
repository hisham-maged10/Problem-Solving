import java.util.Scanner;
public class Sum
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		int[] sum = new int[t];
		for(int i = 0 ; t --> 0 ; ++i){
			sum[i] = input.nextInt() + input.nextInt();
		}
		
		for(int e : sum)
			System.out.println(e);

	}

}
