import java.util.Arrays;

public class Sort_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String s=new String(ch);
		System.out.println(s);
	}

}
