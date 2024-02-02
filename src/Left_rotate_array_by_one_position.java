import java.util.Arrays;

public class Left_rotate_array_by_one_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
	}

}
