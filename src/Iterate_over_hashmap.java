import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Iterate_over_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> f=new HashMap<>();
		f.put(1, "mango");
		f.put(2, "apple");
		f.put(3, "banana");
		//keySet(f);
		//Iterator(f);
		//entrySet(f);
		//streams(f); // best way to filter collection or map
		forEach(f);
		
	}
	private static void forEach(Map<Integer, String> f) {
		// TODO Auto-generated method stub
		f.forEach((key,value)->{
			System.out.println("key "+key);
			System.out.println("value "+value);
		});
	}
	private static void streams(Map<Integer, String> f) {
		// TODO Auto-generated method stub
		f.entrySet().stream().forEach(e->
			System.out.println("key "+e.getKey() +" value "+e.getValue())
			);
	}
	private static void entrySet(Map<Integer, String> f) {
		// TODO Auto-generated method stub
		for(Map.Entry<Integer, String > entry: f.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
	}
	private static void Iterator(Map<Integer, String> f) {
		// TODO Auto-generated method stub
		Iterator<Map.Entry<Integer,String>> iterator=f.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> entry=iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	public static void keySet(Map<Integer,String>f) {
		for(Integer fId:f.keySet()) {
			System.out.println(fId);
			System.out.println(f.get(fId));
		}
	}

}
