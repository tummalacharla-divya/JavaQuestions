import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Elements_present_atLeast_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1= {1,6,8,9,6,4};
		Integer[] arr2= {6,9,4,7,3,2};
		Integer[] arr3= {0,5,1,8,3,4};
		
		List<Integer> l1=Arrays.asList(arr1);
		List<Integer> l2=Arrays.asList(arr2);
		List<Integer> l3=Arrays.asList(arr3);
		
		HashSet<Integer> h=new HashSet<>();
		
		h.addAll(l1);
		h.addAll(l2);
		h.addAll(l3);
		
		List<Integer> f=new ArrayList<Integer>();
		
		for(Integer number:h) {
			if(l1.contains(number)&&l2.contains(number)||l2.contains(number)&&l3.contains(number)||l3.contains(number)&&l1.contains(number)) {
				f.add(number);
			}
		}
		System.out.println(f);
		
		
	}

}
