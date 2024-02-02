
public class Print_numbers_without_using_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumbers(1);
	}

	private static void printNumbers(int n) {
		// TODO Auto-generated method stub
		if(n<=10) {
			System.out.println(n);
			printNumbers(n+1);
		}
	}

}
