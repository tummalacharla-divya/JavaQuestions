
public class Max_min_elements_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,5,8,3,8,5,1};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			else if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
