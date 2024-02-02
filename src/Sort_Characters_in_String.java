import java.util.Arrays;

public class Sort_Characters_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="divya";
		char c[]=str.toCharArray();
		Arrays.sort(c);
		String arr=new String(c);
		System.out.println(arr);
	}

}
