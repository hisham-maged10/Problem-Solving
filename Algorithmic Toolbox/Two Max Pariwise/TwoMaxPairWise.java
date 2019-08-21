import java.util.Scanner;
import java.util.Random;
public class TwoMaxPairWise
{
	
	public static void main(String[] args)
	{

	/*	while(true)
		{
			int testN = new Random().nextInt(200000)+2 ;
			System.out.println(testN);
			int[] testArr = new int[testN];
			Random rand = new Random(5);
			for(int i = 0 ; i < testArr.length ; ++i)
				testArr[i] = rand.nextInt(200000);
			for(int e : testArr)
				System.out.print( e + " ");
		
			System.out.println();
			long res1 = twoMaxPairWise(testArr);
			long res2 = twoMaxPairWiseFast(testArr);
			if(res1 != res2)
			{
				System.out.println("Wrong answer: " + res1 + " " + res2);
				break;
			}
			else
				System.out.println("OK");
		}

	*/




		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] arr = new int[n];

		for(int i = 0 ; i < n ; ++i)
			arr[i] = input.nextInt();

		System.out.println(TwoMaxPairWise.twoMaxPairWiseFast(arr));

	}


	private static long twoMaxPairWise(int[] arr)
	{
		long maxMult = 0;
		for(int i = 0 ; i < arr.length ; ++i)
			for(int j = i + 1 ; j < arr.length ; ++j)
				if(maxMult < (long)(arr[i] * (long)arr[j]))
					maxMult = (long)arr[i] *(long) arr[j];
		
		return maxMult;
	}

	private static long twoMaxPairWiseFast(int[] arr)
	{
		int maxIdxOne = 0;
		int maxIdxTwo = 0;
		for(int i = 1 ; i < arr.length ; ++i)
			if( arr[i] > arr[maxIdxOne] )
				maxIdxOne = i;
                maxIdxTwo = maxIdxOne == 0 ? 1 : 0;
		for(int j = 0 ; j < arr.length ; ++j)
			if( maxIdxOne != j && arr[j] > arr[maxIdxTwo] )
				maxIdxTwo = j;

		return (long)arr[maxIdxOne] * (long)arr[maxIdxTwo];
	}

}
