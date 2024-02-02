import java.util.Scanner;

public class Reverse_a_number {

	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		if(temp==reverseNumber(n)) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not a palindrome");
			//System.out.println(revnum(n));
		}
			
			
	}
	public static int reverseNumber(int n) {
		int reverse=0;
		while (n!=0) {
			int rem=n%10;
			reverse=reverse*10+rem;
			n/=10;
		}
		return reverse;

	}
	public static int revnum(int n) {
		String numstring=String.valueOf(n);
		String rev="";
		for(int i=numstring.length()-1;i>=0;i--) {
			rev=rev+numstring.charAt(i);
		}
		return Integer.valueOf(rev);
		
	}
	

}
