import java.io.FileNotFoundException;

public class driver {
	public static void driver() {
		
		while(true) {
			try {
				factorialCalculator.factorialCalculator(Factorial.origionalNum);
			} 
			catch (FileNotFoundException FNF) {
				FNF.printStackTrace();
			}
			System.out.println(Factorial.origionalNum);

			Factorial.origionalNum+=1;
		}
	}
}
