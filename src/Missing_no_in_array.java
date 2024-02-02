
public class Missing_no_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,6};
		int n=arr.length;
		System.out.println(Calculate_num(arr,n+1));
	}

	private static int Calculate_num(int[] arr, int i) {
		// TODO Auto-generated method stub
		int total_sum=(i*(i+1))/2;
		int sum=0;
		for(int j=0;j<arr.length;j++) {
			sum+=arr[j];
		}
		return total_sum-sum;
	}

}
