
public class Reverse_string_with_preserving_space_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java";
		System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		char[] result=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				result[i]=' ';
			}
		}
		int j=0;
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)!=' ') {
				if(result[j]==' ') {
					j++;
				}
			
				result[j]=str.charAt(i);
				j++;
			}
		}
		
	return String.valueOf(result);
	}
}
