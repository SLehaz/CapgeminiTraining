import java.util.Scanner;

class Array2D
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of Rows: ");
		int rows = s.nextInt();
		System.out.print("Enter the number of Columns: ");
		int columns = s.nextInt();
		
		int[][] arr2d = new int[rows][columns];
		int[] arr1d = new int[rows * columns];
		int k = 0;
		
		for (int i = 0; i < arr2d.length; i++)
		{
			for (int j = 0; j < arr2d.length; j++)
			{
				System.out.print("Enter the number for [" + i + "][" + j + "]: ");
				arr2d[i][j] = s.nextInt();
				arr1d[k++] = arr2d[i][j];
			}
		}
		System.out.print("The elements of the 1D array are: ");
		for (int i = 0; i < arr1d.length; i++)
		{
			System.out.print(arr1d[i] + " ");
		}
	}
}