/**
 * Gauss-Jordan Elimination Program
 * Performs the algorithmic process of Gauss-Jordan Elimination
 * To yield a given matrix's reduced row echelon form
 * @author amartorajaram
 *
 */
public class Matrix 
{
	double[][] matrix;
	/**
	 * Constructs a matrix of a given size
	 * @param rows, number of rows of the matrix
	 * @param columns, number of columns of the matrix
	 */
	public Matrix(int rows, int columns)
	{
		matrix = new double [rows] [columns];
	}
	
	/**
	 * Swap the positions of two rows
	 * @param row1, the first row to be swapped
	 * @param row2, the second row to be swapped
	 */
	public void swap(int row1, int row2)
	{
		double[] temp = matrix[row1];
		matrix[row1] = matrix[row2];
		matrix[row2] = temp;
	}
	
	/**
	 * Divide a row of the matrix by a given scalar
	 * @param row, the row to be divided
	 * @param scalar, the number by which the row is divided
	 */
	public void divide( int row, double scalar)
	{
		for (int i = 0; i < matrix[row].length; i++)
		{
			matrix[row][i] = (1/scalar) * matrix[row][i];
		}
		
	}
	
	/**
	 * Subtract a scalar multiple of one row from another
	 * @param row1, the row to be subtracted from
	 * @param row2, the row to be multiplied and subtracted from the other
	 * @param scalar, the number by which row2 is multiplied
	 */
	
	public void subtractRow(int row1, int row2, double scalar)
	{	
		for (int i = 0; i < matrix[row1].length; i++)
		{
			matrix[row1][i] -=  scalar* matrix[row2][i];
		}
	}
	
	/**
	 * sets the value of the matrix at a given index
	 * @param a the row index to set value
	 * @param b the column index to set value
	 * @param value, the value to be set
	 */
	public void setValue(int a, int b, double value)
	{
		matrix[a][b] = value;
	}
	
	/**
	 * returns the value of the matrix at a given index
	 * @param a the row index to get value
	 * @param b the column index to get value
	 * @return the value of the matrix at that index
	 */
	public double getValue(int a, int b)
	{
		return matrix[a][b];
	}
	

	/**
	 * Checks if the matrix is square 
	 * (if it has the same number of rows and columns)
	 * @param rows, rows of the matrix
	 * @param columns, columns of the matrix
	 * @return true if square, false if not
	 */
	public boolean isSquare(int rows, int columns) {
		if (rows == columns)
		{
		return true;
		}
	
		return false;
	}
	

}
