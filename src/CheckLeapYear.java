import java.util.Scanner;

public class CheckLeapYear {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		if(n%100!=0||n%400==0&&n%4==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}
}
