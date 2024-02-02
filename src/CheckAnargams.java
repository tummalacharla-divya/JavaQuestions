import java.util.*;
public class CheckAnargams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		boolean result=Check_Anargam(str1,str2);
		System.out.println(result);
	}
	public static boolean Check_Anargam(String str1,String str2) {
		char[] s1=str1.toCharArray();
		Arrays.sort(s1);
		char[] s2=str2.toCharArray();
		Arrays.sort(s2);
		return Arrays.equals(s1,s2);
		
	}

}
