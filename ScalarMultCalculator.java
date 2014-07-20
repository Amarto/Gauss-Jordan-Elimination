import java.util.Scanner;
public class ScalarMultCalculator
{
	double scalar;
	
	public Matrix calculateScalarMult(int rows, Matrix aMatrix)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the scalar:");
		while(in.hasNext())
		{
		scalar = in.nextDouble();
		}
		for (int i = 0; i < rows; i++)
		{
			aMatrix.multiply(i, scalar);
		}
		
		in.close();
		return aMatrix;
	}
	
	
	

}
