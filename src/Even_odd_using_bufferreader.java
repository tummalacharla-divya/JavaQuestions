import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Even_odd_using_bufferreader {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Integer n=Integer.parseInt(br.readLine());
		if(n%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=(n/2)*2;
		if(n==res) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
	}

}
