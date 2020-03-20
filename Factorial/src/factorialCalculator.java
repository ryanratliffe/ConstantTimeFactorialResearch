import java.io.FileNotFoundException;
import java.math.BigInteger;

public class factorialCalculator {
	public static void factorialCalculator(long x) throws FileNotFoundException {
        double init = System.currentTimeMillis();
		for (long k = x; k > 1; k--) {
			Factorial.tot = Factorial.tot.multiply(BigInteger.valueOf(k));
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
        fileOutStream.fileOutStream(Factorial.tot, x, init, post);
	}
	
}
