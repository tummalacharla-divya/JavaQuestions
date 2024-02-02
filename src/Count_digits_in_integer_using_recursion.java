
public class Count_digits_in_integer_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3456;
		System.out.println(recursion(num));
	}
	public static int recursion(int num) {
		if(num==0) {
			return 0;
		}
		return 1+recursion(num/10);
	}

}
