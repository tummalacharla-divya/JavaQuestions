import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int count=0;
		/*while(n!=0) {
			int rem=n%10;
			count++;
			n/=10;
		}
		for(int i=n;n!=0;) {
			int rem=n%10;
			count++;
			n=n/10;
		}*/
		for(;n!=0;n=n/10,count++) {
			
		}
		System.out.println(count);
	}
}
