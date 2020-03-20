
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
			}
		}
        double post = System.currentTimeMillis();
		//outStream(tot, x, init, post);
	}
	
	
	public static String timeFromSystemTime(int time) {
		int days = (int) (time / 86400000);
		time = time - (days * 86400000);
		int hour = (int) (time / 3600000) ;
		time = time - (hour * 3600000);
		int min = (int) (time / 60000) ;
		time = time - (min * 60000);
		int sec = (int) (time / 1000) ;
		time = time - (sec * 1000);
		int mili = (int) time;
		
		return days +" days, " + hour + "hours, " + min + " minutes, " 
		+ sec+ " seconds, and "+ mili + "miliseconds.";	
	}
	
	
	public static void zeros() {
		int divider = 5;
		 
        while (tot.divide(count).compareTo(BigInteger.ZERO)>0) {
            zeros.add(tot.divide(count));
            count.add(count.multiply(BigInteger.valueOf(5)));
        }
    }
			
	
	public static void outStream(BigInteger tot, long x, double init, double post) throws FileNotFoundException {
		PrintStream o = new PrintStream(new File("factorial of "+x+".txt")); 
		double time =(post - init);
		int days = (int) (time / 86400000);
		time = time - (days * 86400000);
		int hour = (int) (time / 3600000) ;
		time = time - (hour * 3600000);
		int min = (int) (time / 60000) ;
		time = time - (min * 60000);
		int sec = (int) (time / 1000) ;
		time = time - (sec * 1000);
		int mili = (int) time;
		
        PrintStream console = System.out; 
        System.setOut(o);
        
        System.out.print("this is the factorial of " + x +" equals: ");
        System.out.println(tot+"\n");
        System.out.println("the number of trailing zeros is: "+ zeros);
        System.out.print("This is the calculated operation time: ");    
        System.out.println(days +" days, " + hour + "hours, " + min + " minutes, " + sec+ " seconds, and "+ mili + "miliseconds.");

        System.setOut(console);         
	}
	
	
	public static void main(String[] args) {
		try {
			factorial(500000);
		} 
		catch (FileNotFoundException FNF) {
			FNF.printStackTrace();
		}
		System.out.println("done");
	}
}