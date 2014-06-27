/**
 * Rref Calculator Class
 * Takes in the matrix and outputs its reduced row echelon form
 * @author amartorajaram
 */
public class RrefCalculator 
{
	
	/**
	 * Calculates the reduced row echelon form of a matrix 
	 * given rows and columns and the matrix
	 * @param rows
	 * @param columns
	 * @param aMatrix
	 */
	public Matrix calculateRref(int rows, int columns, Matrix aMatrix)
	{
		int swapcounter = 0;
		int dividecounter = 0;
		int addcounter = 0;
		double determinantscalar = 1;
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
			if (aMatrix.isSquare(rows, columns))
			{
			System.out.println("Swaps: " +swapcounter + '\n' + "Divisions: " 
					+ dividecounter+ '\n' + "Division Scalar: " + determinantscalar + '\n' + "Adds: " + addcounter);
					System.out.println("Determinant of Rref: " + determinantRref); 
					System.out.println("Determinant of Original: " + originalDeterminant);
			}
			
			return aMatrix;
		}

	
}
