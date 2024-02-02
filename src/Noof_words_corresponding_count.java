
public class Noof_words_corresponding_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello world";
		count(str);
	}

	private static void count(String str) {
		// TODO Auto-generated method stub
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]+"->"+s[i].length());
		}
	}
}
