import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort_map_keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<>();
		map.put("apple", "apple");
		map.put("pineapple", "pineapple");
		map.put("banana", "banana");
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey());
		}
		Map<String,String> treemap=new TreeMap<String,String>(map);
		for(Map.Entry<String, String> entry:treemap.entrySet()) {
			System.out.println(entry.getKey());
		}
	}

}
