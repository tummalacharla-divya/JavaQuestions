import java.util.Arrays;
import java.util.Collections;

public class Sort_elements_of_array_in_asc_desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"divya","apple","banana"};
		Arrays.sort(str); // sort elements in ascending order
		System.out.println(Arrays.asList(str));
		Arrays.sort(str,Collections.reverseOrder());// sort in descending order
		System.out.println(Arrays.asList(str));
	}

}
