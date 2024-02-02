import java.util.HashSet;
import java.util.Set;

public class Duplicate_elements_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,90,30,40,40};
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					set.add(arr[i]);
					//System.out.println("duplicate elements are: "+arr[i]);
				}
			}
		}
		System.out.println(set);
		moreMemory(arr);
	}
	public static void moreMemory(int[] arr) {
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				System.out.println("duplicate elements are: "+arr[i]);
			}
			else {
				set.add(arr[i]);
			}
		}
	}
}
