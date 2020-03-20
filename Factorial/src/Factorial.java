
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.*;

public class Factorial {

	static BigInteger tot = new BigInteger("1"); // Or BigInteger.ONE
	static BigInteger zeros = new BigInteger("1");
	static BigInteger count = new BigInteger("5");// Or BigInteger.ONE
	public static void factorial(long x) throws FileNotFoundException {
        double init = System.currentTimeMillis();
		for (long k = x; k > 1; k--) {
			tot = tot.multiply(BigInteger.valueOf(k));
			if((k % 250000) == 0) {
				double percentage = ((double)(x-k)/x);
				double time = System.currentTimeMillis();
				double elapsed= time-init;
				double predicted= (elapsed*(1-percentage))/percentage;
				//predicted = predicted*(1+(1-percentage));
				System.out.println("-------------------------------------------------------------------------------\n"
						+ "percentage complete: "+percentage*100+"/100\n");
				System.out.println("elapsed: "+ sysElapsedTime.sysElapsedTime((int)elapsed)+"\n");
				System.out.println("predicted time remaining: "+ sysElapsedTime.sysElapsedTime((int) predicted));
			}
		}
        double post = System.currentTimeMillis();
        fileOutStream.fileOutStream(tot, x, init, post);
	}

	public static void zeros() {
		int divider = 5;
		 
        while (tot.divide(count).compareTo(BigInteger.ZERO)>0) {
            zeros.add(tot.divide(count));
            count.add(count.multiply(BigInteger.valueOf(5)));
        }
    }
			
	

	
	
	public static void main(String[] args) {
		try {
			factorial(5);
		} 
		catch (FileNotFoundException FNF) {
			FNF.printStackTrace();
		}
		System.out.println("done");
	}
}