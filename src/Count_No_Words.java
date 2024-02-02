import java.util.Scanner;

public class Count_No_Words {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=numberOfWords(s);
		System.out.println(c);
	}
	public static int numberOfWords(String s) {
		int count=0;
		char[] str=s.toCharArray();
		int n=str.length;
		if(str[0]!=' ') {
			count++;
		}
		for(int i=0;i<n-1;i++) {
			if(str[i]==' ') {
				count++;
			}
		}
		/*for(int i=0;i<s.length();i++){
		 * if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
		 * count++;
		 * }
		 * }
		 * */
		return count;
	}
}
