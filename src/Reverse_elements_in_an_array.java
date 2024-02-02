import java.util.Arrays;

public class Reverse_elements_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		int[] arr1=new int[arr.length];
		/*int low=0,high=arr.length-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}*/
		int index=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr1[index++]=arr[i];
		}
		System.out.println(Arrays.toString(arr1));
	}

}
