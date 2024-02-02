
public class Palindrome {
	public static void main(String[] args) {
		String str="mom";
		System.out.println("Give string is Palindrome"+palindrome(str));
	}
	public static boolean palindrome(String str) {
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1+=str.charAt(i);
		}
		
		return str.equals(str1);
		
	}
}
