import java.util.Scanner;
public class Menu 
{
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
		if (selection == 1)
		{
			MatrixBuilder builder = new MatrixBuilder();
			Matrix thisMatrix = builder.buildMatrix();
			RrefCalculator rrefcalc = new RrefCalculator();
			rrefcalc.calculateRref(builder.getRows(), builder.getColumns(), thisMatrix);  
		}
		
		else if (selection == 2)
		{
			MatrixBuilder builder = new MatrixBuilder();
			Matrix thisMatrix = builder.buildMatrix();
			ScalarMultCalculator scalarcalc = new ScalarMultCalculator();
			scalarcalc.calculateScalarMult(builder.getRows(), thisMatrix);
		}
		
		else if (selection == 3)
		{
			//...
		}
	}


}
