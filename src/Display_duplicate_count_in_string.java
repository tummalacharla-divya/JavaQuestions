import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Display_duplicate_count_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java";
		displayDuplicates(str);
	}
	public static void displayDuplicates(String str) {
		Map<Character,Integer> map=new HashMap<>();
		char[] ch=str.toCharArray();
		for(char c:ch) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
			Set<Map.Entry<Character,Integer>> entry=map.entrySet();
			for(Map.Entry<Character, Integer> entry1:entry) {
				if(entry1.getValue()>1) {
					System.out.printf("%s:%d %n",entry1.getKey(),entry1.getValue());
				}
			}
		}
	}

}
