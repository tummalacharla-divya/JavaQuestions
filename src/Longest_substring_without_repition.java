import java.util.HashSet;

public class Longest_substring_without_repition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdab";
		logest(str);
	}

	private static void logest(String str) {
		// TODO Auto-generated method stub
		HashSet<Character> set=new HashSet<>();
		String longestoverall="";
		String longesttillnow="";
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(set.contains(c)) {
				longesttillnow="";
				set.clear();
			}
			set.add(c);
			longesttillnow+=c;
			if(longesttillnow.length()>longestoverall.length()) {
				longestoverall=longesttillnow;
			}
		}
		System.out.println(longestoverall);
	}

}
