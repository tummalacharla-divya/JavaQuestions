import java.util.*;
public class Remove_Duplicates_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character ch:set) {
			System.out.print(ch);
		}
		/*int s=sc.nextInt();
		String str=Integer.toString(s);
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character ch:set) {
			System.out.print(Character.getNumericValue(ch));
		}*/
		/*
		 * Set<Character> set=new HashSet<>();
		 * StringBuffer sf=new StringBuffer();
		 * for(int i=0;i<str.length;i++){
		 * 	Character c=str.charAt(i);
		 * 	if(!set.contains(c)){
		 * 		set.add(c);
		 * 		sf.append(c);
		 * 	}
		 * }
		 * return sf.toString();
		 */
	}

}
/* to convert int to string: Integer.toString(number);
convert string to number using : Integer.parseInt()
Integer.valueOf()*/