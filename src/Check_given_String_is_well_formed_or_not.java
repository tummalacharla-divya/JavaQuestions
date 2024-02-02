import java.util.Stack;

public class Check_given_String_is_well_formed_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[()]{}{[()()]()}";
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(st.empty()) {
				st.push(ch);
			}
			else if(ch=='{'||ch=='('||ch=='[') {
				st.push(ch);
			}
			else if(ch=='}'&&st.peek()=='{') {
				st.pop();
			}
			else if(ch==']'&&st.peek()=='[') {
				st.pop();
			}
			else if(ch==')'&&st.peek()=='(') {
				st.pop();
			}
		}
		if(st.empty()) {
			System.out.println("given string is well formed");
		}
		else {
			System.out.println("given string is not well formed");
		}
	}

}
