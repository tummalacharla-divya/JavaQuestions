
public class Reverse_a_string_using_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="divya";
		System.out.println(recurseString(str));
	}
	public static String recurseString(String str) {
		if(str==null||str.length()<=1) {
			return str;
		}
		return recurseString(str.substring(1))+str.charAt(0);
	}
}
