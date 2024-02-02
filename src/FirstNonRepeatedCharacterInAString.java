import java.security.KeyStore.Entry;
import java.util.Map.*;
import java.util.*;
public class FirstNonRepeatedCharacterInAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c=FirstNonRepeatChar(str);
		System.out.println(c);
	}
	public static char FirstNonRepeatChar(String s) {
		char[] str=s.toCharArray();
		
		char k=' ';
		for(char i:str) {
			int c=0;
			for(char j:str) {
				if(i==j) {
					c++;
				}
			}
			if(c==1) {
				k=i;
				break;
			}
			
		}
		return k;
		/*Map<Character,Integer> countMap=new LinkedHashMap<Character,Integer>(s.length());
		for(char ch:s.toCharArray()) {
			countMap.put(ch,countMap.containsKey(ch)?countMap.get(ch)+1:1);
		}
		for(java.util.Map.Entry<Character, Integer> entry:countMap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didnot find any non repeated character");*/
	}
}
