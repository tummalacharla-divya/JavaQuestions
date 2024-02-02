import java.util.Scanner;

public class Count_no_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str="divya";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);*/
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int count=0;
		for(char c:ch) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println(count);
	}

}
