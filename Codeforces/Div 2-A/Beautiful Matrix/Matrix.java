import java.util.Scanner;
public class Matrix
{
	public static void main(String[] args)
	{
		System.out.println(getMoves());
	}

	public static int getMoves()
	{
		Scanner input = new Scanner(System.in);
		int[][] matrix = new int[5][5];
		int row = 0, col = 0;
		for(int i = 0 ; i < 5 ; ++i)
			for( int j = 0 ; j < 5 ; ++j)
			{
				matrix[i][j] = input.nextInt();
				if(matrix[i][j] == 1 )
				{
					row = i ;
					col = j;
				}
			}
		int moves = 0;
		while( row != 2 || col != 2 )
		{
			if(row < 2){
				++row;
				++moves;
			}else if( row > 2 )
			{
				--row;
				++moves;
			}

			if( col < 2){
				++col;
				++moves;
			}else if ( col > 2 )
			{
				--col;
				++moves;
			}
		}
		return moves;
	}
}
