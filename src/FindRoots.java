
public class FindRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3, b=4, c=5;
		float det=((b*b)-(4*a*c));
		double root1;
		double root2;
		if(det>0) {
			root1=-b+Math.sqrt(det)/(2*a);
			root2=-b+Math.sqrt(det)/(2*a);
			System.out.printf("root1 =%.2f and root2 =%.2f", root1,root2);
		}
		else if(det==0) {
			root1=root2= -b/(2*a);
			System.out.printf("root1 =%.2f and root2 =%.2f", root1,root2);

		}
		else {
			root1=-b/(2*a);
			root2=Math.sqrt(-det)/(2*a);
			System.out.printf("root1 =%.2f and root2 =%.2f", root1,root2);
		}
	}

}
