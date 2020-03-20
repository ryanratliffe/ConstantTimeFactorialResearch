import java.math.BigInteger;

public class trailingZeros {
	public static void trailingZeros() {
        BigInteger divider = new BigInteger("5");
        BigInteger zero = new BigInteger("0");
        BigInteger five = new BigInteger("5");
        BigInteger origionalNum = BigInteger.valueOf(Factorial.origionalNum);
        
        while ((origionalNum.divide(divider)).compareTo(zero)>0) {
        	Factorial.zeros = Factorial.zeros.add(origionalNum.divide(divider)) ;
        	divider = divider.multiply(five);
        }
        //System.out.println(Factorial.zeros);
    }
}
