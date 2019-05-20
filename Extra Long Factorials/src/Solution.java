import java.util.*;
import java.math.BigInteger; 

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
    	BigInteger result = new BigInteger("1");
    	for(int i = n; i >= 2; i--) {
    		result=result.multiply(BigInteger.valueOf(i));
    	}
    	System.out.println(result);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
