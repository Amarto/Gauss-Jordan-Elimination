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
		System.out.println("Initial Matrix: ");
		for (int i =0; i < rows; i++) { 
			for (int j = 0; j < columns; j++) { 
			System.out.print(" " + aMatrix.getValue(i, j)); 
			} 
			System.out.println(""); 
			} 
		
		


		
		int i = 0;
		int j = 0;
		while (i < rows && j < columns)
		{
			//search columns for nonzero entry in row i
			int k = i;
			while (k < rows && aMatrix.getValue(k,j) == 0)
			{
				k++;
			}
			
			if (k < rows)
			{
			
				if (aMatrix.getValue(k,j) != 0)
				{
					//if k is not equal to i, swap rows 
					if (k != i)
					{
						aMatrix.swap(i, k);
					}
					

				
					//if the value of the leading number is not one, divide row so it is
					if (aMatrix.getValue(i,j) != 1)
					{
						aMatrix.divide(i, aMatrix.getValue(i,j));
					}
				


					
					for (int m = 0; m < rows; m++)
					{
						if (m != i && aMatrix.getValue(m,j) != 0)
						{
							aMatrix.subtractRow(m, i, (aMatrix.getValue(m,j)));
						}
						
					}

				
				
				}
				i++;
			}
			j++;
			
			
			
			//if nonzero entry is found at row k
			
			//if k is not equal to i, then swap i with k
			
			//if value at (i,j) is not one, divide by one over value
			
			//subtract from each row other than i an appropriate multiple of i
			//to eliminate all other nonzero entries from column j
		}
		System.out.println("Rref Matrix: ");
		for (int q =0; q < rows; q++) { 
			for (int a = 0; a < columns; a++) { 
			System.out.print(" " + aMatrix.getValue(q, a)); 
			} 
			System.out.println(""); 
			} 
		

						
		in.close();
		
	}
	
}
