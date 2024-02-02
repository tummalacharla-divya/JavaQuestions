import java.util.*;
public class CompareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		boolean result=compareTwostrings(str1,str2);
		System.out.println(result);
		
	}
	public static boolean compareTwostrings(String str1,String str2) {
		
		return str1.equals(str2);
		//return str1.equalsIgnoreCase(str2);
		//return str1.compareTo(str2);
		//return str1.compareToIgnoreCase(str2);
	}

}
