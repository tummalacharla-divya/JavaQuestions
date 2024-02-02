//abcd
//bcda //o/p
//cdab

public class To_check_whether_two_strings_are_rotation_of_each_other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isRotated("abcd","bcda"));
	}
	public static boolean isRotated(String str,String rotated) {
		if(str==null||rotated==null) {
			return false;
			
		}
		else if(str.length()!=rotated.length()) {
			return false;
		}
		else {
			String concat=str+str;
			return concat.contains(rotated);
		}
	}

}
