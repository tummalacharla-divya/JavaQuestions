
public class Print_all_permutations_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String ans=" ";
		permute(str,ans);
	}

	static void permute(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String l_substr=str.substring(0,i);		
			String r_substr=str.substring(i+1);	
			String rest=l_substr+r_substr;
			permute(rest,ans+ch);
		}
	}

}
