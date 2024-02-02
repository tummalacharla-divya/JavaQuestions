import java.util.*;
public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] s=str.split(" ");
		int l=s.length;
		//char[] n=new char[s.length];
		for(int i=l-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}
	

}
