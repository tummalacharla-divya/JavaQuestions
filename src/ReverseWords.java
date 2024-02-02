public class ReverseWords {
	public static void main(String[] args) {
		String str="Welcome to java program";
		
		System.out.println(reverseWord(str));
	}
	public static String reverseWord(String str) {
		String[] c=str.split(" ");
		String s="";
		for(int i=c.length-1;i>=0;i--) {
			s=s+c[i]+" ";
		}
		return s;
		
	}

}
