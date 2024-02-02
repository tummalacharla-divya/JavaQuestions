import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Split_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to java";
		String str[]=s.split(" ");
		printString(str,"split method");
		List<String> strings=Pattern.compile(" ").splitAsStream(s).collect(Collectors.toList());
		System.out.println("pattern class");
		//System.out.println(strings);
		for(String string:strings) {
			System.out.println(string);
		}
		StringTokenizer string=new StringTokenizer(s," ");
		System.out.println("string tokenizer method");
		while(string.hasMoreTokens()) {
			String s1=string.nextToken();
			System.out.println(s1);
		}
	}
	public static void printString(String str[],String approach) {
		System.out.println(approach);
		for(String string:str) {
			System.out.println(string);
		}
	}
}
