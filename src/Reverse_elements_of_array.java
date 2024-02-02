import java.util.Arrays;
import java.util.Stack;

public class Reverse_elements_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		int arr[]= {1,4,5};
		for(int i=0;i<arr.length;i++) {
			s.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)s.pop();
		}
		System.out.println(Arrays.toString(arr));
	}

}
