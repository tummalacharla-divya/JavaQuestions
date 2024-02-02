import java.util.Stack;

public class Reverse_words_in_string {
	
	static void reverseWords(String str) {
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				st.push(str.charAt(i));
			}else {
				while(st.empty()==false) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
		}
		System.out.print(" ");
		while(st.empty()==false) {
			System.out.print(st.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseWords("hello world java");
	}

}
