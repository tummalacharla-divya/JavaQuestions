import java.util.Scanner;

public class Fibanocci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			System.out.println(fib(i)+" ");
		}
	}
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
				
	}
}
