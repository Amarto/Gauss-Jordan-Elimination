
public class Test {

	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to Amarto's Matrix Operations Calculator!");
		Menu menu = new Menu();
		menu.printmenu();
		
		MatrixBuilder builder = new MatrixBuilder();
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter the number of rows: ");
//		int rows = in.nextInt();
//		System.out.println("Please enter the number of columns: ");
//		int columns = in.nextInt();
		
		Matrix thisMatrix = builder.buildMatrix();
		RrefCalculator rrefcalc = new RrefCalculator();
		rrefcalc.calculateRref(builder.getRows(), builder.getColumns(), thisMatrix);  
		
		

	
	}

}
