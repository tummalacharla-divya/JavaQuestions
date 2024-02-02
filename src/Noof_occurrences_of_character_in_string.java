import java.util.Scanner;

public class Noof_occurrences_of_character_in_string {
	public static void main(String[] args) {
		/*String s="aabaadddfva";
		char c='a';
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
		*/
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int i=str.length();
		Scanner sc1=new Scanner(System.in);
		String ch=sc1.next();
		str = str.replace(ch, "");
		int f=str.length();
		System.out.println(i-f);
	}
}
