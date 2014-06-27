/**
 * Tester Class for Gauss-Jordan Elimination Program
 * @author amartorajaram
 *
 */
import java.util.ArrayList;
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
		
		


		int swapcounter = 0;
		int dividecounter = 0;
		int addcounter = 0;
		int determinantscalar = 1;
		double determinantRref = 1;
		double originalDeterminant = 1;
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
						swapcounter ++;
					}
					

				
					//if the value of the leading number is not one, divide row so it is
					if (aMatrix.getValue(i,j) != 1)
					{
						aMatrix.divide(i, aMatrix.getValue(i,j));
						dividecounter++;
						determinantscalar *= (1/aMatrix.getValue(i,j));	//TODO this is broken
					}
				


					//for all other rows, subtract multiples of given row until all other entries
					//in the column are zero
					for (int m = 0; m < rows; m++)
					{
						if (m != i && aMatrix.getValue(m,j) != 0)
						{
							aMatrix.subtractRow(m, i, (aMatrix.getValue(m,j)));
							addcounter++;
						}
						
					}

				
				
				}
				i++;
			}
			j++;
			
			
			

		}
		
		for (int l = 0; l < rows; l++)
		{
		
			for (int k = 0; k < columns; k++)
			{
				if (aMatrix.getValue(l,k) == -0.0)
					
				aMatrix.setValue(l,k, 0.0);
			}
		}
		
		if (aMatrix.isSquare(rows, columns))
		{	
			for (int q = 0; q < rows; q++)
			{
			determinantRref *= aMatrix.getValue(q, q);
			}
				
		originalDeterminant = (Math.pow(-1, swapcounter)) * determinantscalar *
				determinantRref;
		}
		
		System.out.println("Rref Matrix: ");
		for (int q =0; q < rows; q++) 
		{ 
			for (int a = 0; a < columns; a++) 
			{ 
			System.out.print(" " + aMatrix.getValue(q, a)); 
			} 
			System.out.println(""); 
		
			
		} 
		System.out.println("Swaps: " +swapcounter + '\n' + "Divisions: " 
				+ dividecounter+ '\n' + "Division Scalar: " + determinantscalar + '\n' + "Adds: " + addcounter);
				System.out.println("Determinant of Rref: " + determinantRref); 
				System.out.println("Determinant of Original: " + originalDeterminant);
		

						
		in.close();
		
	}
	
	
}
