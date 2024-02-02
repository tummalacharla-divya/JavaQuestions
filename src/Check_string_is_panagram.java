//check the string contains all english alphabets
//the quick brown fox jumps over the lazy dog
public class Check_string_is_panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="the quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s.toLowerCase()));
	}

	private static boolean isPanagram(String s) {
		// TODO Auto-generated method stub
		if(s.length()<26) {
			return false;
		}else {
			for(char ch='a';ch<='z';ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
		}
		return true;
	}

}
