import java.util.Arrays;

public class Remove_element_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] arr1=new int[arr.length-1];
		int index=3;
		for(int i=0,k=0;i<arr.length;i++) {
			if(arr[i]==index) {
				continue;
			}
			else {
				arr1[k++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
