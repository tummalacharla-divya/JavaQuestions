import java.util.HashMap;
import java.util.Map;

//if element appears more than arraysize/2 times.
public class Majority_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,10,50,70,10,10};
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer, Integer> i:map.entrySet()) {
			if(i.getValue()>arr.length/2) {
				int res=i.getKey();
				System.out.println(res);
			}
		}
	}

}
