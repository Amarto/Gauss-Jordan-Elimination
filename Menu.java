import java.util.Scanner;
public class Menu 
{
	public static final int RREF_CALC = 1;
	public static final int SCALAR_MULT = 2;
	public static final int MATRIX_MULT = 3;
	public static final int MATRIX_INV = 4;
	Scanner in = new Scanner(System.in);

	public void printMenu()
	{
    System.out.println("   MATRIX OPERATIONS                ");
    System.out.println("====================================");
    System.out.println(" Options:                           ");
    System.out.println("        1. Calculate Rref           ");
    System.out.println("        2. Multiply Matrix by Scalar");
    System.out.println("        3. Multiply Two Matrices    ");
    System.out.println("        4. Matrix Inverse           ");
	}
	
	public void promptResponse()
	{
		System.out.println("Please enter your selection: ");
		int selection = in.nextInt();
		MatrixBuilder builder = new MatrixBuilder();
		if (selection == RREF_CALC)
		{
			
			Matrix thisMatrix = builder.buildMatrix();
			RrefCalculator rrefcalc = new RrefCalculator();
			rrefcalc.calculateRref(builder.getRows(), builder.getColumns(), thisMatrix);  
		}
		
		else if (selection == SCALAR_MULT)
		{
			
			Matrix thisMatrix = builder.buildMatrix();
			ScalarMultCalculator scalarcalc = new ScalarMultCalculator();
			System.out.println("Please enter the scalar: ");
			double scalar = in.nextDouble();
			scalarcalc.calculateScalarMult(builder.getRows(), thisMatrix, scalar);
		}
		
		else if (selection == MATRIX_MULT)
		{
			Matrix firstMatrix = builder.buildMatrix();
			int firstMatrixColumns = builder.columns;
			Matrix secondMatrix = builder.buildMatrix();
			int secondMatrixRows = builder.rows;
			
			MatrixMultCalculator matrixmultcalc = new MatrixMultCalculator();
			if (matrixmultcalc.isValid(firstMatrixColumns, secondMatrixRows))
			{
				matrixmultcalc.multMatrix(firstMatrix, secondMatrix);
			}
				
			//...
			
		}
	}


}
