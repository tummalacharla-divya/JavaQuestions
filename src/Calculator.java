import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		System.out.println("enter operator");
		char op=sc.next().charAt(0);
		double output=0;
		
		switch(op) {
		case '+':
			output=num1+num2;
			break;
		case '-':
			output=num1-num2;
			break;
		case '*':
			output=num1*num2;
			break;
		case '/':
			output=num1/num2;
			break;
		default:
			System.out.println("invalid operator");
			break;
		}
		System.out.println(output);
	}

}
