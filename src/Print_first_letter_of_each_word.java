
public class Print_first_letter_of_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java";
		splitWords(str);
	}
	public static void splitWords(String str) {
		String w[]=str.split(" ");
		for(int i=0;i<w.length;i++) {
			String s=w[i];
			System.out.print(s.charAt(0));
		}
	}

}
