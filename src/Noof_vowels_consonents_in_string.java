
public class Noof_vowels_consonents_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vcount=0;
		int ccount=0;
		String str="apple";
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))){
			//if(str.charAt(Character.toLowerCase(i))=='a'||str.charAt(Character.toLowerCase(i))=='e'||str.charAt(Character.toLowerCase(i))=='i'||str.charAt(Character.toLowerCase(i))=='o'||str.charAt(Character.toLowerCase(i))=='u') {
				vcount++;
			}
			else {
				ccount++;
			}
		}
		System.out.println("vowel count"+vcount);
		System.out.println("consonent count"+ccount);
	}
		private static boolean isVowel(char ch) {
			// TODO Auto-generated method stub
			ch=Character.toUpperCase(ch);
			return (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
		}

}

	