
public class FactorsOfNumber_from_1_to_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			System.out.println("Factors Of "+i+" are");
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					System.out.print(" "+j);
				}
			}
			System.out.println();
		}
	}

}
