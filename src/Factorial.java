import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
		fact_using_BigInteger(n);
		
	}
	public static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static void fact_using_BigInteger(int n) {
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=n;i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}
}
