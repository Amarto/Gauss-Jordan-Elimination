import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
	{
		MatrixBuilder builder = new MatrixBuilder();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of rows: ");
		int rows = in.nextInt();
		System.out.println("Please enter the number of columns: ");
		int columns = in.nextInt();
		
		Matrix thisMatrix = builder.buildMatrix(rows, columns);
		RrefCalculator rrefcalc = new RrefCalculator();
		rrefcalc.calculateRref(rows, columns, thisMatrix);  
		
		
//		if thisMatrix.isSquare(rows, columns)
//		{
//			DeterminantCalculator
//		}
		in.close();
	}

}
