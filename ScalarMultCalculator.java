//import java.util.Scanner;
public class ScalarMultCalculator
{
//	public static final double DEFAULT_SCALAR = 1.0;
	double scalar;
	
	public Matrix calculateScalarMult(int rows, Matrix aMatrix, double scalar)
	{
//		Scanner in2 = new Scanner(System.in);
//		System.out.println("Please enter the scalar:");
//		boolean noInput = true;
//		do 
//		{
//			System.out.println("in loop");
//			double value = in2.nextDouble();
//			//scalar = Double.parseDouble(sclr);
//		} while (noInput);
		for (int i = 0; i < rows; i++)
		{
			aMatrix.multiply(i, scalar);
		}
		
//		in2.close();
		return aMatrix;
	}
	
	
	

}
