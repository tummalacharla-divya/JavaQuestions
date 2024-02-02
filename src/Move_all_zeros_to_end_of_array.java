import java.util.Arrays;

public class Move_all_zeros_to_end_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,8,9,3,0,0,2};
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp[j++]=arr[i];
			}
		}
		/*for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				temp[j++]=arr[i];
			}
		}*/
		System.out.println(Arrays.toString(temp));
	}

}
