import java.util.Arrays;

public class Anargam {
	public static void main(String[] args) {
		String str="java";
		String str2="avaj";
		System.out.println(anargam(str,str2));
	}
	public static boolean anargam(String str1,String str2) {
		char[] s1=str1.toCharArray();
		char[] s2=str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.equals(s1,s2);
		
	}
}
