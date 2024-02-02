//swap two numbers without temp variable
public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=9;
		System.out.println("before swapping"+a+","+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping"+a+","+b);
	}
}
