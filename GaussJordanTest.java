/**
 * Tester Class for Gauss-Jordan Elimination Program
 * @author amartorajaram
 *
 */
import java.util.Scanner;
public class GaussJordanTest 
{
	
	public static void main(String[] args)
	{
		
		/**
		 * Read user input to get matrix dimensions
		 * Construct a matrix of these dimensions
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number of rows: ");
		int rows = in.nextInt();
		System.out.println("Please enter the number of columns: ");
		int columns = in.nextInt();
		AugmentedMatrix aMatrix = new AugmentedMatrix(rows, columns);
		
		/**
		 * Fill the matrix with values from user input
		 */
		for (int l = 0; l < rows; l++)
		{
		System.out.println("Please enter the elements of row " + (l+1) 
				+ " one by one");
			for (int k = 0; k < columns; k++)
			{
			int value = in.nextInt();
			aMatrix.setValue(l, k, value);
			}
		}	
		/**
		 * First, check for rows with all zeroes
		 * and move them to the bottom
		 * by swapping with the last row
		 */
		for (int l = 0; l < rows; l++)
		{	
			int zeroCounter = 0;
			for (int k = 0; k < columns; k++)
			{	
				
				if (aMatrix.getValue(l, k) == 0)
				{
					zeroCounter++;
				}
				if (zeroCounter == columns)
				{
					aMatrix.swap(l, rows);
				}
				zeroCounter = 0;
			}
		}	
		
		/**
		 * Then, make sure that the leftmost nonzero entry is a 1
		 * (leading 1)	
		 * If it is not, divide the row so that it is
		 */
		for (int l = 0; l < rows; l++)
		{
			int k = 0;
			double scalar;
			do
			{
				if (aMatrix.getValue(l,k) != 0 && aMatrix.getValue(l,k) != 1)
				{
					scalar = 1/aMatrix.getValue(l,k);
					aMatrix.mult(l, scalar);
				}	
				k++;	
			}	
			while (aMatrix.getValue(l,k) == 0);
		}	
			
			
		/**
		 * Then ensure that each *column* containing a leading 1 
		 * has only zeroes in its other entries
		 */
			
		/**
		 * Then ensure that the leading 1 in any row is to the left of the
		 * leading 1's below it	
		 */
		
			
			
			
		in.close();
		
	}
	
}
