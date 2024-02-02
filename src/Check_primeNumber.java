import java.util.Scanner;

public class Check_primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean prime=true;
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime=false;
			}
			
		}
		System.out.println("the number is prime "+prime);
	}

}
