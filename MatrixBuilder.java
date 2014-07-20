/**
 * MatrixBuilder Class
 * Reads user input for matrix dimensions and entries
 * and constructs an augmented matrix object out of those values
 * @author amartorajaram
 */

import java.util.Scanner;
public class MatrixBuilder 
{

	int rows;
	int columns;
	

	/**
	 * Builds a matrix from user-input parameters
	 * @param rows, number of rows of the matrix
	 * @param columns, number of columns of the matrix
	 */
	public Matrix buildMatrix()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of rows: ");
		rows = in.nextInt();
		System.out.println("Please enter the number of columns: ");
		columns = in.nextInt();
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
		in.close();
		return aMatrix;
	}
	
	public int getRows()
	{
		return rows;
	}
	
	public int getColumns()
	{
		return columns;
	}
	

	
	

}
