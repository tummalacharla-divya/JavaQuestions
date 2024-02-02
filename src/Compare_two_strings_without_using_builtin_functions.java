import java.util.*;
public class Compare_two_strings_without_using_builtin_functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int count=0;
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)==s2.charAt(i)) {
					count++;
				}
			}
			if(count==s1.length()) {
				System.out.println("strings are equal");
			}
			else {
				System.out.println("strings are not equal");
			}
		}
		else {
			System.out.println("strings are not equal");
		}
		/*
		 * boolean isCompare=false;
		 * for(int i=0;i<s1.length();i++){
		 * 		if(s1.charAt(i)!=s2.charAt(i)){
		 * 			isCompare=false;
		 * 			break;
		 * 		}
		 * 		isCompare=true;
		 * }
		 * System.out.println("two strings are equal"+isCompare);
		 * */
	}

}
