/**
 * Gauss-Jordan Elimination Program
 * Performs the algorithmic process of Gauss-Jordan Elimination
 *To yield a given matrix's reduced row echelon form
 * @author amartorajaram
 *
 */
public class GaussJordan 
{
	/**
	 * Constructs a matrix of a given size
	 * @param rows, number of rows of the matrix
	 * @param columns, number of columns of the matrix
	 */
	public GaussJordan(int rows, int columns)
	{
		int [] [] matrix = new int [rows] [columns];
		//fill matrix
		
		//for testing purposes, use a matrix:
		//int[][] matrix = new int[][] {{0,2,1,-1},{0,0,3,1},{0,0,0,0}};
		
		
	}
	
	/**
	 * Swap the positions of two rows
	 * @param aMatrix the matrix on which the operation is performed
	 * @param row1, the first row to be swapped
	 * @param row2, the second row to be swapped
	 */
	public void swap(int[][] aMatrix, int row1, int row2)
	{
		
	}
	
	/**
	 * Multiply a row of the matrix by a given scalar
	 * @param aMatrix, the matrix on which the operation is performed
	 * @param row, the row to be multiplied
	 * @param scalar, the number by which the row is multiplied
	 */
	public void mult(int[][] aMatrix, int row, int scalar)
	{
		
	}
	
	/**
	 * Add a scalar multiple of one row to another
	 * @param aMatrix, the matrix 
	 * @param row1, the row to be added to
	 * @param row2, the row to be multiplied and added to the other
	 * @param scalar, the number by which row2 is multiplied
	 */
	public void addTo(int[][] aMatrix, int row1, int row2, int scalar)
	{
		
	}

}
