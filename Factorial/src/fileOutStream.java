import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.BigInteger;

public class fileOutStream {
	public static void fileOutStream(BigInteger tot, long x, double init, double post) throws FileNotFoundException {
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
        System.out.println("the number of trailing zeros is: "+ Factorial.zeros);
        System.out.print("This is the calculated operation time: ");    
        System.out.println(days +" days, " + hour + "hours, " + min + " minutes, " + sec+ " seconds, and "+ mili + "miliseconds.");

        System.setOut(console);         
	}
}
