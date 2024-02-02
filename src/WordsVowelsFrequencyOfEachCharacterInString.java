import java.util.Map;
import java.util.TreeMap;

public class WordsVowelsFrequencyOfEachCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="leran java coding.";
		WordsVowelsFrequencyOfEachCharacterInString  p=new WordsVowelsFrequencyOfEachCharacterInString ();
		p.getWordsvowelcount(str);
		p.frequency(str);
	}

	private void frequency(String str) {
		// TODO Auto-generated method stub
		TreeMap<Character,Integer> map=new TreeMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			Integer c=map.get(str.charAt(i));
			if(map.get(str.charAt(i))==null) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), ++c);
				
			}
			
		}
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	private void getWordsvowelcount(String str) {
		// TODO Auto-generated method stub
		int wcount=0,vcount=0,uppercount=0;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			switch(c) {
				case ' ':
				case '.':
					wcount++;
			}
			switch(c) {
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vcount++;
			}
			if(c>=65&&c<=90) {
				uppercount++;
			}
		}
		System.out.println("word count="+wcount);
		System.out.println("vowel count="+vcount);
		System.out.println("uppercase count="+uppercount);
	}

}
