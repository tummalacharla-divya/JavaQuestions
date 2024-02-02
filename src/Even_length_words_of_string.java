
public class Even_length_words_of_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcom to java1";
		for(String s:str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}
	}

}
