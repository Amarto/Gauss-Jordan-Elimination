/**
 * Tester Class for Gauss-Jordan Elimination Program
 * @author amartorajaram
 *
 */
import java.util.Scanner;
public class GaussJordanTest {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number of rows: ");
		int i = in.nextInt();
		System.out.println("Please enter the number of columns: ");
		int j = in.nextInt();
		GaussJordan aMatrix = new GaussJordan(i, j);
		
		for (int l = 0; l < i; l++)
		{
		System.out.println("Please enter the elements of row " + l 
				+ " one by one");
			for (int k = 0; k < j; k++)
			{
			int value = in.nextInt();
			aMatrix.setValue(l, k, value);
			}
			
		
		}
	}

}
