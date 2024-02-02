import java.util.Scanner;

public class Convert_Fahrenheit_to_Celsius {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float f=sc.nextFloat();
		float c=((f-32)*5)/9;
		System.out.println(c);
	}
}
