import java.util.*;
public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int l=str.length();
		String str2="";
		for(int i=l-1;i>=0;i--) {
			str2+=str.charAt(i);
		}
		if(str.equals(str2)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
