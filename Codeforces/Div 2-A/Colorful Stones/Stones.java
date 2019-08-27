import java.util.Scanner;
public class Stones
{
	public static void main(String[] args)
	{
		System.out.println(getPos());
	}

	public static int getPos()
	{
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String inst = in.nextLine();
		int sPtr = 0;
		for( int instPtr = 0, n = inst.length() ; instPtr < n ; ++instPtr)
		{
			if(s.charAt(sPtr) == inst.charAt(instPtr))
				++sPtr;
		}
		return ++sPtr;
	}
}
