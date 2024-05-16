package actionClass;
import java.util.Scanner;

public class ReverseNum {

	    public int reverseNumber(int x) {
	        int reversed = 0;
	        while (x != 0) {
	            int digit = x % 10;
	            x /= 10;
	            // Check for integer overflow/underflow
	            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
	                return 0;
	            }
	            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
	                return 0;
	            }
	            reversed = reversed * 10 + digit;
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	    	ReverseNum reverseInteger = new ReverseNum();
	        Scanner reader = new Scanner(System.in);  // Reading from System.in
	        System.out.println("Enter a number: ");
	        int n = reader.nextInt(); // Scans the next token of the input as an int.

	        System.out.println(reverseInteger.reverseNumber(n));

	        //once finished
	        reader.close();
	    }
}


