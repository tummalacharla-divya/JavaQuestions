
public class Swap_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		//usingTempVariable(a,b);
		//withOutTempVariable(a,b);
		withoutTemp(a,b);
	}

	private static void withoutTemp(int a, int b) {
		// TODO Auto-generated method stub
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a);
		System.out.println(b);
	}

	private static void withOutTempVariable(int a, int b) {
		// TODO Auto-generated method stub
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println(a);
		System.out.println(b);
	}

	private static void usingTempVariable(int a, int b) {
		// TODO Auto-generated method stub
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}

}
