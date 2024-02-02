import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		//String str="sandeep";
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(removeDuplicate(str));
		
	}
	public static String removeDuplicate(String str) {
		Set<Character> set=new HashSet<Character>();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if(!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				sf.append(str.charAt(i));
			}
		}
		return sf.toString();
	}
}
