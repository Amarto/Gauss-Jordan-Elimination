/**
 * MatrixBuilder Class
 * Reads user input for matrix dimensions and entries
 * and constructs an augmented matrix object out of those values
 * @author amartorajaram
 */

import java.util.Scanner;
public class MatrixBuilder 
{

	

	/**
	 * Builds a matrix from user-input parameters
	 * @param rows, number of rows of the matrix
	 * @param columns, number of columns of the matrix
	 */
	public Matrix buildMatrix(int rows, int columns)
	{
		Scanner in = new Scanner(System.in);
		Matrix aMatrix = new Matrix(rows, columns);
		
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
		
		//maybe this part should go in the test class
		in.close();
		return aMatrix;
	}
	
	

}
