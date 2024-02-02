
public class Given_num_is_perfect_square_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		System.out.println(isPerfectSquare(n));
		for(int i=1;i<n/2;i++) {
			if(i*i==n) {
				System.out.println("given num is square of "+i);
				return;
			}
		}
	}
	public static boolean isPerfectSquare(int n) {
		if(n>=0) {
			int num=(int)Math.sqrt(n);
			return ((num*num==n));
		}
		return false;
	}
}
