/**
 * Tester Class for Gauss-Jordan Elimination Program
 * @author amartorajaram
 *
 */
import java.util.Scanner;
public class GaussJordanTest {
	
	public static void main(String[] args)
	{
		
		/**
		 * Read user input to get matrix dimensions: i rows, j columns
		 * Construct a matrix of these dimensions
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number of rows: ");
		int i = in.nextInt();
		System.out.println("Please enter the number of columns: ");
		int j = in.nextInt();
		GaussJordan aMatrix = new GaussJordan(i, j);
		
		/**
		 * Fill the matrix with values from user input
		 */
		for (int l = 0; l < i; l++)
		{
		System.out.println("Please enter the elements of row " + (l+1) 
				+ " one by one");
			for (int k = 0; k < j; k++)
			{
			int value = in.nextInt();
			aMatrix.setValue(l, k, value);
			}
			
		
			
		
		
		}
	}

}
