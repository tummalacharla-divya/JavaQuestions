
public class Firstdigit_lastDigit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=234;
		int lastdigit=i%10;
		int firstdigit=i;
		while(firstdigit>=10) {
			firstdigit/=10;
		}
		System.out.println(firstdigit);
		System.out.println(lastdigit);
		System.out.println(firstdigit+lastdigit);
	}

}
