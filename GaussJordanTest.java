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
				double value = in.nextDouble();
				aMatrix.setValue(l, k, value);
			}
		}	
		
		
		
		/**
		 * Scan columns for first nonzero entry. Identify the column
		 * which contains it. 
		 * Look for the top nonzero entry in the column
		 * Iterate through the loop and create an array ranking the rows
		 * Swap the rows in another loop 
		 * This should yield the rows in the correct order
		 */

		int counter = 0;
		int[] ranking = new int[rows];
		
		for (int j = 0; j < columns; j++)
		{
			int k = 0;
			do
			{	
				if (aMatrix.getValue(k, j) != 0)
				{
					ranking[counter] = k+1;
					counter++;
				}	
				k++;
			} while (k < rows && aMatrix.getValue(k, j) == 0); 
		}
		for (int i = 1; i < rows; i++)
		{
			aMatrix.swap(ranking[i], i); //TODO figure out these indices
		}
		
		for (int i = 0; i < rows; i++)
		{	
			for (int j = 0; j < columns; j++)
			{
				System.out.println(aMatrix.getValue(i, j));
			}
		}
		
		/**
		 * Check for rows with all zeroes
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
			}	
			if (zeroCounter == columns)
			{
				aMatrix.swap(l, rows-1);
			}
			zeroCounter = 0;
			
		}	
		
		for (int i = 0; i < rows; i++)
		{	
			for (int j = 0; j < columns; j++)
			{
				System.out.println(aMatrix.getValue(i, j));
			}
		}
		
		/**
		 * Then, make sure that the leftmost nonzero entry is a 1
		 * (leading 1)	
		 * If it is not, divide the row so that it is
		 */
		
		for (int i = 0; i < rows; i++)
		{
			int j = 0;
			do
			{
				if(aMatrix.getValue(i,j) != 0)
				{
					aMatrix.mult(i, 1/(aMatrix.getValue(i,j)));
				}
				j++;
			} while (aMatrix.getValue(i,j) == 0);
		}

			
		/**
		 * Then ensure that each *column* containing a leading 1 
		 * has only zeroes in its other entries
		 * Subtracting multiples of rows from other rows 
		 * This should yield the rref matrix
		 */
	
		for(int i = 0; i < rows; i++)
		{
			int j = 0;
			while (aMatrix.getValue(i,j) == 0)
			{
				j++;
			}
			for (int k = 0; k < rows; k++)
			{
				if ((aMatrix.getValue(k,j) != 0) && (k != i))
				{
					aMatrix.addTo(k, i, aMatrix.getValue(k,j));
				}
			}
			
		}
			
			
		in.close();
		
	}
	
}
