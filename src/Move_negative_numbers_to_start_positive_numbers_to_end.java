import java.util.Arrays;

public class Move_negative_numbers_to_start_positive_numbers_to_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-4,8,9,3,-6,-8,2};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				temp[j++]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				temp[j++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
	}

}
